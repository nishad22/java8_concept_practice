package streamapi;

import model.Student;
import model.StudentDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7);

        List<Integer> listEmpty = new ArrayList<>();


        //with identity
        int val = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println("reduce() function with identity: " + val);

        //without identity
        Optional<Integer> result = list.stream().reduce((a, b) -> a * b);
        System.out.println("reduce() function without identity: " + result);
        System.out.println("reduce() function without identity isEmpty(): " + result.isEmpty());
        System.out.println("reduce() function without identity isPresent(): " + result.isPresent());

        //if list is empty
        Optional<Integer> result1 = listEmpty.stream().reduce((a, b) -> a * b);
        System.out.println("reduce() function without identity emptyList: " + result1);
        System.out.println("reduce() function without identity emptyList isEmpty(): " + result1.isEmpty());
        System.out.println("reduce() function without identity emptyList isPresent(): " + result1.isPresent());

        //Student with highestGPA:
        Optional<Student> result2 = StudentDatabase.getAllStudents().stream()
                .reduce((s1, s2) -> {
                    if (s1.getGpa() > s2.getGpa()) {
                        return s1;
                    } else {
                        return s2;
                    }
                });
        if (result2.isPresent()) {
            System.out.println("Student with highest GPA: "+result2);
        }

        //Student with highestGPA refactor
        Optional<Student> result3 = StudentDatabase.getAllStudents().stream()
                .reduce((a,b) -> a.getGpa()> b.getGpa() ? a:b);

        if (result3.isPresent()) {
            System.out.println("Student with highest GPA: "+result3);
        }
    }
}
