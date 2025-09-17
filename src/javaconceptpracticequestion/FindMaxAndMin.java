package javaconceptpracticequestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxAndMin {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Optional<Integer> min = listOfIntegers.stream().min(Comparator.comparingInt(num -> num));
        min.ifPresent(num -> System.out.println("min value in list: "+num));

        listOfIntegers.stream()
                .max(Comparator.comparingInt(num -> num))
                .ifPresent(num -> System.out.println("max value in list: "+num));
    }
}
