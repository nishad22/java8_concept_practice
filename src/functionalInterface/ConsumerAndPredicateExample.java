package functionalInterface;

import model.Student;
import model.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerAndPredicateExample {

    Predicate<Student> p1 = (student) -> student.getGpa() >= 3.9;
    Predicate<Student> p2 = (student) -> student.getGradeLevel() >= 3;

    BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    BiConsumer<String, List<String>> biConsumer =
            (name,activities) -> System.out.println(name+" : "+activities);

    Consumer<Student> c1 = (student -> {
        if (p2.and(p1).test(student)) {
            biConsumer.accept(student.getName(),student.getActivities());
        }
    });

    Consumer<Student> c2 = (student -> {
        if (biPredicate.test(student.getGradeLevel(),student.getGpa())) {
            biConsumer.accept(student.getName(),student.getActivities());
        }
    });

    private void printNumberAndActivities(List<Student> studentList) {
        studentList.forEach(c1);
        System.out.println("----------------------------");
        studentList.forEach(c2);

    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudents();
        new ConsumerAndPredicateExample().printNumberAndActivities(studentList);
    }
}
