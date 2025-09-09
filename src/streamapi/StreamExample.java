package streamapi;

import model.Student;
import model.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        //student -> student.getName() == Student::getName;
        Function<Student,String> f1 = Student::getName;
        List<Student> allStudents = StudentDatabase.getAllStudents();
        allStudents.forEach(student -> {
            System.out.println("Function result: "+ f1.apply(student));
        });

        //stream API sequential ops
        Map<String, List<String>> activitiesMap = allStudents.stream()
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(activitiesMap);

        //get student activity with 3 or more with Stream API

        Map<String, List<String>> map = allStudents.stream()
                .filter(student -> student.getGradeLevel()>=3)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(map);

        //get student with gpq > 3.9

        Predicate<Student> studentGpaPredicate = student -> student.getGpa()>=3.9;

        List<String> names = allStudents.stream()
                .filter(studentGpaPredicate)
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
