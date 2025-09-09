package streamterminaloperation;

import model.StudentDatabase;

import java.util.stream.Collectors;

public class CountingExample {

    public static void main(String[] args) {
        System.out.println(" counting(): "+counting());
    }

    private static long counting() {
        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGpa()>3.9)
                //.collect(Collectors.counting());
                .count();
    }
}
