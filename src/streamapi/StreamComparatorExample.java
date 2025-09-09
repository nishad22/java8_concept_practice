package streamapi;

import model.Student;
import model.StudentDatabase;

import java.util.Comparator;
import java.util.List;

public class StreamComparatorExample {

    public static void main(String[] args) {
       // System.out.println("listOfSortedStudentByName: "+listOfSortedStudentByName());
        listOfSortedStudentByName().forEach(System.out::println);
        System.out.println("-----------------------------------");
        listOfSortedStudentByGpa().forEach(System.out::println);
        System.out.println("-----------------------------------");
        listOfSortedStudentByGpaDescOrder().forEach(System.out::println);
    }

    private static List<Student> listOfSortedStudentByGpaDescOrder() {
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .toList();
    }

    private static List<Student> listOfSortedStudentByGpa() {
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .toList();
    }

    private static List<Student> listOfSortedStudentByName() {
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
    }
}
