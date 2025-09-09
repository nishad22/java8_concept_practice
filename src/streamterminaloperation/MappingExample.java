package streamterminaloperation;

import model.Student;
import model.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class MappingExample {

    public static void main(String[] args) {

       List<String> studentList = StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .toList();

        System.out.println("map(): "+studentList);

       //we can enhance the above code by using mapping() in stream

        List<String> mappingStudent = StudentDatabase.getAllStudents().stream()
                .collect(mapping(Student::getName,toList()));
        System.out.println("mapping(): "+mappingStudent);

        //above mapping can be simplified as below

        List<String> simplified = StudentDatabase.getAllStudents().stream().map(Student::getName).collect(toList());
        System.out.println("simplified mapping(): "+simplified);
    }
}
