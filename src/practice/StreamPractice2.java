package practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;


public class StreamPractice2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        getListOfEvenNum(list);
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        getListofNumStartWith1(myList);
        List<Integer> myList1 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        findDuplicateElement(myList1);
        findFirstElement(myList1);
        countTheElement(myList1);
        ;
    }



    // Given a list of integers, find the total number of elements present in the list using Stream functions?
    private static void countTheElement(List<Integer> myList1) {

        long count1 = myList1.stream().count();
        System.out.println("using count: " + count1);

        int[] arr = {10, 15, 8, 49, 25, 98, 98, 32, 15};
        long count2 = Arrays.stream(arr)
                .boxed().count();
        System.out.println("using boxed: " + count2);
    }


    // Given the list of integers, find the first element of the list using Stream functions?
    private static void findFirstElement(List<Integer> myList1) {
        int val = myList1.stream().limit(1).toList().getFirst();
        System.out.println("findFirstElement(): " + val);

        Optional<Integer> val1 = myList1.stream().findFirst();
        System.out.println("findFirstElement() using findFirst(): " + val1.get());

    }

    //How to find duplicate elements in a given integers list in java using Stream functions?
    private static void findDuplicateElement(List<Integer> myList1) {
        Set<Integer> hashSet = new HashSet<>();
        myList1.stream()
                .filter(n -> !hashSet.add(n))
                .forEach(System.out::println);
    }

    // Given a list of integers, find out all the numbers starting with 1 using Stream functions
    private static void getListofNumStartWith1(List<Integer> myList) {
        List<String> result = myList.stream()
                .map(num -> num + "")
                .filter(num -> num.startsWith("1"))
                .toList();

        System.out.println("getListofNumStartWith1: " + result);
    }

    //Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
    private static void getListOfEvenNum(List<Integer> list) {
        List<Integer> result = list.stream()
                .filter(num -> num % 2 == 0)
                .toList();
        System.out.println("getListOfEvenNum(): " + result);


        //using partitioning()
        Map<Boolean, List<Integer>> result2 = list.stream().collect(partitioningBy(num -> num % 2 == 0, toList()));
        System.out.println("using partitioning(): " + result2.get(true));
    }

}
