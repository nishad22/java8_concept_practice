package defaults;

import model.Student;
import model.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {

    //static Consumer<Student> consumer = (student) -> System.out.println(student);
    static Consumer<Student> consumer = System.out::println; //improvised version of above
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);


    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudents();
        System.out.println("Before sort");
        studentList.forEach(consumer);
//        sortByName(studentList);
//        comparatorChaining(studentList);
        sortwithNullValues(studentList);
    }

    private static void sortByName(List<Student> studentList) {
//        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        studentList.sort(nameComparator);
        System.out.println("After sortByName");
        studentList.forEach(consumer);
    }

    private static void comparatorChaining(List<Student> studentList) {
        //firxt
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        System.out.println("After comparatorChaining");
        studentList.forEach(consumer);
    }

    private static void sortwithNullValues(List<Student> studentList) {
        Comparator<Student> comparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(comparator);
        System.out.println("After sortwithNullValues");
        studentList.forEach(consumer);

    }
}
