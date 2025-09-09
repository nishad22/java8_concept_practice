package streamterminaloperation;

import model.Student;
import model.StudentDatabase;

import java.util.stream.Collectors;

public class JoiningExample {

    public static void main(String[] args) {
        System.out.println("joining1(): "+joining1());
        System.out.println("joining2(): "+joining2());
        System.out.println("joining3(): "+joining3());
    }

    private static String joining1(){
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    private static String joining2(){
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(" "));
    }

    private static String joining3(){
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(" ","{","}"));
    }
}
