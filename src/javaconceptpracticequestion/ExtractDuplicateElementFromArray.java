package javaconceptpracticequestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExtractDuplicateElementFromArray {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> set = new HashSet<>();
        listOfIntegers.stream()
                .filter(num -> !set.add(num))
                .forEach(num -> System.out.println("duplicate element: "+num));
    }
}
