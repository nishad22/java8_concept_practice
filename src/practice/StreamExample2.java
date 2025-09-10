package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamExample2 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        groupListOfStringLength(names);
        joiningListOfString(names);
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50,65);
        averageOfListOfInt(numbers);
        List<Integer> removeDuplicate = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        removeDuplicateFromList(removeDuplicate);
        findFirstElement(numbers);
        allmatch(numbers);
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        flattenList(listOfLists);
        toMapString(names);
        optionalOfNullable(names);
        useParallelStream(listOfLists);
    }

    //Write a program to demonstrate the use of parallelStream for parallel processing.
    private static void useParallelStream(List<List<Integer>> listOfLists) {
        int sum = listOfLists.parallelStream()
                .flatMap(List::stream)
                .toList().stream().mapToInt(Integer::intValue).sum();

        System.out.println("parallelStream sum: "+sum);

        int sum1 = listOfLists.parallelStream()
                .flatMapToInt(list -> list.stream().mapToInt(Integer::intValue))
                .sum();
        System.out.println("parallelStream improvised: " + sum1);

    }

    //Write a program to demonstrate the use of Optional to avoid NullPointerException.
    private static void optionalOfNullable(List<String> names) {
        Optional<List<String>> optionalName = Optional.ofNullable(names);
        System.out.println("optional demo");
        optionalName.ifPresentOrElse(System.out::println,() -> System.out.println("no element found"));
    }

    //Write a program to create a map from a list of strings using Collectors.toMap.
    private static void toMapString(List<String> names) {
        Map<String,Integer> map = names.stream()
                .collect(Collectors.toMap(name ->name,String::length));

        System.out.println("Collectors.toMap(): "+map);
    }

    // Write a program to flatten a list of lists using flatMap.
    private static void flattenList(List<List<Integer>> listOfLists) {
        List<Integer> flatmaplist = listOfLists.stream()
                .flatMap(List::stream) //alternative of list -> list.stream
                .toList();
        System.out.println("flatMap: "+flatmaplist);
    }

    //Write a program to check if all elements in a list satisfy a condition using allMatch.
    private static void allmatch(List<Integer> numbers) {
        boolean result = numbers.stream()
                .allMatch(num -> num%2==0); //as 65 present in list due to which getting false
        System.out.println("allMatch: "+result);
    }

    //Write a program to find the first element of a list using Streams.
    private static void findFirstElement(List<Integer> numbers) {
        Optional<Integer> result = numbers.stream()
                .findFirst();
       result.ifPresent(num -> System.out.println("findFirstElement: "+num));

    }

    private static void removeDuplicateFromList(List<Integer> removeDuplicate) {
        List<Integer> result = removeDuplicate.stream()
                .distinct()
                .toList();

        System.out.println("removeDuplicateFromList: "+result);
    }

    //Write a program to find the average of a list of integers using Streams.
    private static void averageOfListOfInt(List<Integer> numbers) {
        OptionalDouble average = numbers.stream()
                .mapToInt(num -> num) //alternative -> mapToInt(Integer::intValue)
                .average();
        System.out.println("using averge(): "+average.getAsDouble());

        int avg = numbers.stream().collect(Collectors.averagingInt(Integer::intValue)).intValue();
        System.out.println("using Collectors.averagingInt(): "+avg);
    }

    //Write a program to concatenate all strings in a list using Collectors.joining.
    private static void joiningListOfString(List<String> names) {
        String name = names.stream().collect(Collectors.joining(","));
        System.out.println("joiningListOfString: "+name);

        //improvised version
        name = String.join("-",names);
        System.out.println("improvised version of joining string: "+name);
    }

    //Write a program to group a list of strings by their length using Collectors.groupingBy.
    private static void groupListOfStringLength(List<String> names) {
        Map<Integer,List<String>> groupBy = names.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(String::length));

        System.out.println("groupListOfStringLength: "+groupBy);
    }
}
