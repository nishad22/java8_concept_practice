package functionalInterface;

import model.Student;
import model.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (student) -> student.getGradeLevel() > 2;
    static Predicate<Student> p2 = (student) -> student.getGpa() > 3.6;

    static List<Student> studentList = StudentDatabase.getAllStudents();

    private static void filterStudentGradeLevel() {
        studentList.forEach(student -> {
            if (p1.test(student)) {
                System.out.println(student.getName());
            }
        });
    }

    private static void filerStudentGpaLevel() {
        studentList.forEach(student -> {
            if (p2.test(student)) {
                System.out.println(student.getName());
            }
        });
    }

    private static void filterStudents() {
        System.out.println("-------------filterStudents-------------");
        studentList.forEach(student -> {
            if (p1.and(p2).test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentGradeLevel();
        System.out.println("----------------------------");
        filerStudentGpaLevel();
        filterStudents();
    }
}
