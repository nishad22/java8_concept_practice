package javaconceptpracticequestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FindSeconfLargest {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers.stream()
                .sorted(Comparator.naturalOrder())
               // .peek(num -> System.out.print(num + " "))
                .skip(listOfIntegers.size() - 2)
                .findFirst()
                .ifPresent(num -> System.out.println("second largest element: "+num));

    }
}
