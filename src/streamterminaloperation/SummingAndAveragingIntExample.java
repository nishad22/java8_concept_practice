package streamterminaloperation;

import model.Student;
import model.StudentDatabase;

import java.util.stream.Collectors;

public class SummingAndAveragingIntExample {

    public static void main(String[] args) {
        System.out.println("sum(): " + sum());
        System.out.println("sumSmiplified(): " + sumSmiplified());
        System.out.println("average(): " + average());

    }

    private static int sum() {
        return StudentDatabase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    private static int sumSmiplified() {
        return StudentDatabase.getAllStudents().stream().mapToInt(Student::getNoteBooks).sum();
    }

    private static double average() {
        return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.averagingDouble(Student::getGpa));
    }
}
