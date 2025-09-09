package optional;

import model.Student;
import model.StudentDatabase;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        //below line will give null pointer exception
//        System.out.println("student name(): " + studentName().length());
        //to avoid null pinter exception we have added null check in below method
        addedNullCheckForStrin();

        //rather than adding null check, alternate approach
        /**
         * Optional introduced in Java 8
         */
        System.out.println("getNameOptional() throws null: "+getNameOptional());
        addedNullCheckWithOptional();
    }

    private static void addedNullCheckWithOptional() {
        if (getNameOptional().isPresent()){
            System.out.println("Optional name: "+getNameOptional().get());
        } else {
            System.out.println("name not found");
        }
    }

    private static Optional<String> getNameOptional() {
//        Optional<Student> student = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        if (student.isPresent()){
            return student.map(Student::getName); //extended version student.map(student1 -> student1.getName());
        }
        return Optional.empty();
    }

    private static void addedNullCheckForStrin() {
        if (studentName() != null) {
            System.out.println("student name(): " + studentName());
        } else {
            System.out.println("name not found");
        }
    }

    private static String studentName() {
        Student student = null;
        //Student student1 = StudentDatabase.studentSupplier;
        if (student != null) {
            return student.getName();
        }
        return null;
    }
}
