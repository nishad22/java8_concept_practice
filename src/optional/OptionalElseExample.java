package optional;

import model.Student;

import java.util.Optional;

public class OptionalElseExample {

    public static void main(String[] args) {
        System.out.println("orElse(): "+orElse());
        System.out.println("orElseGet(): "+orElseGet());
        System.out.println("orElseThrowWithOutSupplier(): "+orElseThrowWithOutSupplier());
        System.out.println("orElseThrow(): "+orElseThrow());
    }

    private static String orElse(){
        Optional<Student> student = Optional.ofNullable(null); //return : Optional.empty
        String name = student.map(Student::getName).orElse("Default");
        return name;
    }

    private static String orElseGet(){
        Optional<Student> student = Optional.ofNullable(null); //return : Optional.empty
        String name = student.map(Student::getName).orElseGet(() -> "Default");
        return name;
    }

    private static String orElseThrow(){
        Optional<Student> student = Optional.ofNullable(null); //return : Optional.empty
        String name = student.map(Student::getName).orElseThrow(() -> new RuntimeException("the objec is null"));
        return name;
    }

    private static String orElseThrowWithOutSupplier(){
        Optional<Student> student = Optional.ofNullable(null); //return : Optional.empty
        String name = student.map(Student::getName).orElseThrow();
        return name;
    }
}
