package streamapi;

import model.Student;
import model.StudentDatabase;

import java.util.List;

public class FilterExample {
    public static void main(String[] args) {

        List<Student> femaleStudentList = StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .toList();

        femaleStudentList.forEach(System.out::println);
    }
}
