package streamterminaloperation;

import model.Student;
import model.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class PartitioningByExample {

    public static void main(String[] args) {
        example_partition_1();
        example_partition_2();
    }

    private static void example_partition_1(){
        Map<Boolean, List<Student>> booleanListMap = StudentDatabase.getAllStudents().stream()
                .collect(partitioningBy(student -> student.getGpa()>=3.8));

        System.out.println("example_partition_1() "+booleanListMap);
    }

    private static void example_partition_2(){
        Map<Boolean, Set<Student>> booleanListMap = StudentDatabase.getAllStudents().stream()
                .collect(partitioningBy(student -> student.getGpa()>=3.8,toSet()));

        System.out.println("example_partition_2() "+booleanListMap);
    }
}
