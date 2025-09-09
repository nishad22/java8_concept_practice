package streamterminaloperation;

import model.Student;
import model.StudentDatabase;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toSet;

public class GroupingByExample {

    public static void main(String[] args) {
        System.out.println("groupingByGender(): " + groupingByGender());
        System.out.println("stringListMap(): " + stringListMap());
        twoLevelGrouping1();
        twoLevelGrouping2();
        threeArgumentGrouping3();
        calculateToGpa();
    }

    private static Map<String, List<Student>> groupingByGender() {
        return StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender));
    }

    private static Map<String, List<Student>> stringListMap() {
        return StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "Outstanding" : "average"));
    }

    private static void twoLevelGrouping1() {
        Map<Integer, Map<String, List<Student>>> map = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "Outstanding" : "average")));
        System.out.println("twoLevelGrouping1() " + map);
    }

    private static void twoLevelGrouping2() {
        Map<String, Integer> map = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getName,
                        summingInt(Student::getNoteBooks)));
        System.out.println("twoLevelGrouping2() " + map);
    }

    private static void threeArgumentGrouping3() {
        LinkedHashMap<String, Set<Student>> studentSet = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, toSet()));

        System.out.println("studentSet(): " + studentSet);
    }

    private static void calculateToGpa() {
        Map<Integer, Optional<Student>> stringListMap = StudentDatabase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println("calculateToGpa(): "+stringListMap);


        Map<Integer, Student> stringMapOptional = StudentDatabase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println("stringMapOptional: "+stringMapOptional);
    }
}
