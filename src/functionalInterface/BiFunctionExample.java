package functionalInterface;

import model.Student;
import model.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, String>> studentFunction = (students, studentPredicate) -> {
        Map<String, String> map = new HashMap<>();
        students.forEach(student -> {
            if (studentPredicate.test(student)) {
                map.put(student.getName(), student.getGender());
            }
        });
        return map;
    };

    public static void main(String[] args) {
        Predicate<Student> p1 = student -> student.getGradeLevel() > 3;
        System.out.println("The result is: "+studentFunction.apply(StudentDatabase.getAllStudents(),p1));
    }
}
