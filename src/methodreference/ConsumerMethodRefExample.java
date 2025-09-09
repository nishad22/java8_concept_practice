package methodreference;

import model.Student;
import model.StudentDatabase;

import java.util.function.Consumer;
import java.util.function.Predicate;


public class ConsumerMethodRefExample {

    /*
     *className::methodName
     */
    static Consumer<Student> c1 = System.out::println;

    /*
     * classname::instanceMethodName
     * */
    static Consumer<Student> c2 = Student::printListOfActivities;

    // normal one
    static Predicate<Student> p1 = student -> student.getGradeLevel() >= 2;

    //refactored one
    static Predicate<Student> p2 = ConsumerMethodRefExample::refactorCodeForGradeLevel;

    public static boolean refactorCodeForGradeLevel(Student student) {
        return student.getGradeLevel() >= 2;
    }

    public static void main(String[] args) {
        StudentDatabase.getAllStudents().forEach(c1);
        System.out.println("---------------------------------");
        StudentDatabase.getAllStudents().forEach(c2);
        System.out.println("---------------------------------");
        System.out.println(p1.test(StudentDatabase.studentSupplier.get()));
        System.out.println(p2.test(StudentDatabase.studentSupplier.get()));
    }
}
