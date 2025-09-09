package streamterminaloperation;

import model.Student;
import model.StudentDatabase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class MinByMaxByExample {

    public static void main(String[] args) {
        if (minByExample().isPresent() && minBySimplified().isPresent()) {
            System.out.println("minByExample: " + minByExample().get());
            System.out.println("minBySimplified: " + minBySimplified().get());
        }

        if (maxByExample().isPresent() && maxBySimplified().isPresent()) {
            System.out.println("maxByExample: " + maxByExample().get());
            System.out.println("maxBySimplified: " + maxBySimplified().get());
        }

    }

    private static Optional<Student> minByExample() {
        return StudentDatabase.getAllStudents().stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    //below is the simplified version of minBy()
    private static Optional<Student> minBySimplified() {
        return StudentDatabase.getAllStudents().stream()
                .min(Comparator.comparing(Student::getGpa));
    }

    private static Optional<Student> maxByExample() {
        return StudentDatabase.getAllStudents().stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }

    //below is the simplified version of maxBy()
    private static Optional<Student> maxBySimplified() {
        return StudentDatabase.getAllStudents().stream()
                .max(Comparator.comparing(Student::getGpa));
    }
}
