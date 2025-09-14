package practice;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

//Given a list of integers, sort all the values present in it using Stream functions?
public class SortTheStream {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        sort1(myList);
        System.out.println("\nusing IntStream:");
        sort2();
    }

    private static void sort2() {
        int[] arr = {10,15,8,49,25,98,98,32,15};
        List<Integer> list = Arrays.stream(arr).boxed().sorted().toList();
        list.forEach(num -> System.out.print(num+" "));
    }

    private static void sort1(List<Integer> myList) {
        System.out.println("By using sorted(): ");
        myList.stream().sorted(Comparator.naturalOrder()).forEach(num -> System.out.print(num+" "));
    }
}
