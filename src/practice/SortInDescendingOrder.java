package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Given a list of integers, sort all the values present in it in descending order using Stream functions?
public class SortInDescendingOrder {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        int[] arr = {10, 15, 8, 49, 25, 98, 98, 32, 15};

        System.out.println("using comparator: ");
        myList.stream().sorted(Comparator.reverseOrder()).forEach(num -> System.out.print(num + " "));

        System.out.println("\nusing Intstream: ");
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(num -> System.out.print(num + " "));
    }
}
