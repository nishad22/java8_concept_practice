package functionalInterface;

import model.Student;
import model.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> f1 = String::toUpperCase;
    static Function<String, String> f2 = (str) -> str.toUpperCase().concat("defaults");

    static Function<List<Student>, Map<String,Double>> studentMap = (students -> {
        Map<String,Double> map = new HashMap<>();
        students.forEach(student -> {
            map.put(student.getName(),student.getGpa());
        });
        return map;
     });

    static Function<List<Student>, Map<String,Double>> studentFunction = (students) -> {
        Map<String,Double> map = new HashMap<>();
        students.forEach(student -> {
            map.put(student.getName(),student.getGpa());
        });
        return map;
    };

    public static void main(String[] args) {
        System.out.println("The result with accept(): "+f1.apply("java"));

        //andThen would produced result in ordered manner
        System.out.println("The result with andThen() "+f1.andThen(f2).apply("java"));

        //compose() would execute parameter function (f2) first then outer function (f1)
        System.out.println("The result with compose() "+f1.compose(f2).apply("java"));

        //studentMap
        System.out.println("The student map: "+studentMap.apply(StudentDatabase.getAllStudents()));
    }
}
