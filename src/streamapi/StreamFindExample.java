package streamapi;

import model.Student;
import model.StudentDatabase;

import java.util.Optional;

public class StreamFindExample {

    public static void main(String[] args) {
        System.out.println("The result of findAny(): " + findAny());
        System.out.println("The result of findFirst(): " + findFirst());

    }

    private static Optional<Student> findFirst() {
        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findFirst();
    }

    private static Optional<Student> findAny() {
        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }
}
