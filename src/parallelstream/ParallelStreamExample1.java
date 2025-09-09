package parallelstream;

import model.Student;
import model.StudentDatabase;

import java.util.List;

public class ParallelStreamExample1 {

    private static List<String> printDistinctActivitiesSequential() {
        Long startTime = System.currentTimeMillis();
        List<String> studenList = StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
        Long endTime = System.currentTimeMillis();
        System.out.println("Sequential Stream Time to execute: " + (endTime - startTime));
        return studenList;
    }

    private static List<String> printDistinctActivitiesParallel() {
        Long startTime = System.currentTimeMillis();
        List<String> studenList = StudentDatabase.getAllStudents().stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
        Long endTime = System.currentTimeMillis();
        System.out.println("Parallel Stream Time to execute: " + (endTime - startTime));
        return studenList;
    }

    public static void main(String[] args) {
        printDistinctActivitiesSequential();
        printDistinctActivitiesParallel();
    }
}
