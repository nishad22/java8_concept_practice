package streamapi;

import model.Student;
import model.StudentDatabase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class StreamMapExample {

    private static List<String> getNames() {
       return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .toList();
    }

    private static Set<String> getNamesSet() {
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)//it will just get the name from Student List
//                .map(name -> name.toUpperCase()) //as above map is returning String hence we can perform string operation
                .map(String::toUpperCase)
                .collect(toSet());


    }

    public static void main(String[] args) {
        System.out.println(getNames());
        System.out.println(getNamesSet());
    }
}
