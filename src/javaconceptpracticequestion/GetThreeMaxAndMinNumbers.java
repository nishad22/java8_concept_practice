package javaconceptpracticequestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//How do you get three maximum numbers and three minimum numbers from the given list of integers?
public class GetThreeMaxAndMinNumbers {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        System.out.println("first 3 Minimum element: ");
        listOfIntegers.stream().sorted().limit(3).forEach(num -> System.out.print(num+" "));

        System.out.println("\nfirst 3 maximum element using skip(): ");
        listOfIntegers.stream().sorted().skip(listOfIntegers.size()-3).forEach(num -> System.out.print(num+" "));

        System.out.println("\nfirst 3 maximum element using limit(): ");
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(num -> System.out.print(num+" "));
    }
}
