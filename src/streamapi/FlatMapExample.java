package streamapi;

import model.Student;
import model.StudentDatabase;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

    public static void main(String[] args) {
        System.out.println(printListOfActivities());
        System.out.println(printListOfString());
        System.out.println("printDistinctActivities: "+printDistinctActivities());
        System.out.println("printCountOfDistinctActivities "+printCountOfDistinctActivities());
        System.out.println("printSortedListOfActivities "+printSortedListOfActivities());
    }

    private static List<String> printSortedListOfActivities() {
        return  StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .sorted()
                .toList();
    }

    private static Long printCountOfDistinctActivities() {
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .count();
    }

    private static List<String> printDistinctActivities() {
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .toList();
    }

    private static List<String> printListOfString() {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Geeks", "For"),
                Arrays.asList("GeeksForGeeks", "A computer portal"),
                Arrays.asList("Java", "Programming")
        );

        return listOfLists.stream()
//                .flatMap(lists -> lists.stream())
                .flatMap(List::stream)
                .toList();
    }

    private static List<String> printListOfActivities() {
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
//                .peek(list -> System.out.println("flatmap stream: "+list))
                .toList();
    }


}
