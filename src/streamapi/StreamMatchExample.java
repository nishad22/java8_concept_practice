package streamapi;

import model.StudentDatabase;

public class StreamMatchExample {
    public static void main(String[] args) {
        System.out.println("Result of allMatch(): "+allMatch());
        System.out.println("Result of anyMatch(): "+anyMatch());
        System.out.println("Result of anyMatch(): "+noneMatch());
    }

    // as no student has GPA 5 it will return true. If I put 3.5 GPA it will return false
    private static boolean noneMatch() {
        return StudentDatabase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=5);
    }

    //it does not match any the condition as all student has less than 4.1 GPA
    private static Boolean anyMatch() {
        return StudentDatabase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>=4.1);
    }

    //it will return false not all the student has gpa>3.9
    // in case of 3.5 it will return true
    private static Boolean allMatch() {
        return StudentDatabase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=3.9);
    }
}
