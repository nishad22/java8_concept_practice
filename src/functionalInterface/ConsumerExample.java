package functionalInterface;

import model.Student;
import model.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    private static final List<Student> studentList = StudentDatabase.getAllStudents();
    private static final Consumer<Student> c1 = (student)
            -> System.out.println(student.getName() +" "+student.getActivities());


    private static void printStudent() {
        Consumer<Student> c1 = (System.out::println); //student -> System.out.println(student)
        studentList.forEach(c1);
    }

    private static void printStudentActivitiesWithName(){
        Consumer<Student> c3 = (student) -> System.out.println(student.getName());
        Consumer<Student> c2 = (student) -> System.out.println(student.getActivities());
        studentList.forEach(c3.andThen(c2)); //consumer chaining
    }

    private static void printStudentActivitiesAndNameInOneLine(){
        studentList.forEach(c1);
    }

    private static void printStudentWhoseGradeGreaterThanTwo(){
        Consumer<Student> c1 = (student ) -> {
            if(student.getGradeLevel() > 2) {
                System.out.println(student.getName());
            }
        };
        studentList.forEach(c1);
    }

    private static void printStudentGradeWithActivities(){
        studentList.forEach(student -> {
            if (student.getGradeLevel()>2){
                c1.accept(student);
            }
        });
    }

    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
        consumer.accept("Nishad");
        printStudent();
        System.out.println("-----------------------------");
        printStudentActivitiesWithName();
        System.out.println("-----------------------------");
        printStudentActivitiesAndNameInOneLine();
        System.out.println("-----------------------------");
        printStudentWhoseGradeGreaterThanTwo();
        System.out.println("-----------------------------");
        printStudentGradeWithActivities();
    }
}
