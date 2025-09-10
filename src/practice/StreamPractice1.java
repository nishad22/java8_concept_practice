package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamPractice1 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Alex");
        getListOfNameStartWithA(names);

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("sum of integers");
        sumOfEvenNumbers(integerList);

        List<String> toUpperCase = Arrays.asList("alice", "bob", "anna", "alex");
        toUpperCaseUsingMap(toUpperCase);

        List<Integer> integerList1 = Arrays.asList(10, 20, 5, 30, 15);
        findMaxNumber(integerList1);

        List<String> sort = Arrays.asList("Adam", "Jenny", "Emily", "Dave", "Sophia", "James");
        sortInDescOrder(sort);
    }

    //Write a program to sort a list of strings in descending order using Streams.
    private static void sortInDescOrder(List<String> sort) {
        List<String> list = sort.stream()
                .sorted()
                .toList().reversed();
        System.out.println("sortInDescOrder: "+list);

        List<String> listComparator = sort.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("using comparator: "+listComparator);
    }

    //Write a program to find the maximum number in a list using Streams.
    private static void findMaxNumber(List<Integer> integerList1) {
        OptionalInt maxNum = integerList1.stream()
                .mapToInt(Integer::intValue)
                .max();

        //System.out.println("findMaxNumber: "+maxNum.getAsInt());
        maxNum.ifPresent(val -> System.out.println("findMaxNumber(): "+val));

        //using comparator
        Optional<Integer> max = integerList1.stream()
                .max(Comparator.comparing(Integer::intValue)); // integer -> integer
        System.out.println("using comparator: "+max.get());

        //using comparator naturalOrdering
        Optional<Integer> maxComparator = integerList1.stream()
                .max(Comparator.naturalOrder()); // integer -> integer
        System.out.println("using comparator natural order: "+maxComparator.get());

    }

    //Write a program to convert a list of strings to uppercase using map.
    private static void toUpperCaseUsingMap(List<String> toUpperCase) {
        List<String> uppercase = toUpperCase.stream()
                .map(String::toUpperCase)// name -> name.toUpperCase()
                .toList();
        System.out.println("toUpperCaseUsingMap: "+uppercase);
    }

    //Write a program to find the sum of all even numbers in a list using Streams.
    private static void sumOfEvenNumbers(List<Integer> integerList) {

        //via reduce terminal operation
        int sumOfEvenNumbers = integerList.stream()
                .filter(integer -> integer % 2 == 0)
                .reduce(0, Integer::sum); // expanded version -> reduce(1, (a, b) -> a + b);
        System.out.println("reduce function: " + sumOfEvenNumbers);

        //via reduce which returns optional
        Optional<Integer> sumOptional = integerList.stream()
                .filter(integer -> integer % 2 == 0)
                .reduce(Integer::sum);
        sumOptional.ifPresent(integer -> System.out.println("Optional sum exmaple: " + integer));

        //via mapToInt
        int sumWithMapToInt = integerList.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("mapToInt sum example: " + sumWithMapToInt);

        int summing = integerList.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("using collector summingnt(): "+summing);

        //improvised version of above
        int mapToInt = integerList.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("using collector mapToInt(): "+mapToInt);

    }

    // Write a program to filter a list of strings and return only those that start with "A".
    private static void getListOfNameStartWithA(List<String> names) {
        List<String> nameWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        System.out.println("getListOfNameStartWithA(): " + nameWithA);
    }

}
