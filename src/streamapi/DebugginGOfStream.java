package streamapi;

import model.Student;
import model.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DebugginGOfStream {
    public static void main(String[] args) {
        //get student with gpq > 3.9

        Predicate<Student> studentGpaPredicate = student -> student.getGpa()>=3.9;

        List<String> names = StudentDatabase.getAllStudents().stream()
                .peek((student) -> {System.out.println("once stream is started: "+student);})
                .filter(student -> student.getGradeLevel()>=3)
                .peek((student) -> {System.out.println("filter 1: "+student);})
                .filter(studentGpaPredicate)
                .peek((student) -> {System.out.println("filter 2: "+student);})
                .map(Student::getName)
                .toList();
    }
}
