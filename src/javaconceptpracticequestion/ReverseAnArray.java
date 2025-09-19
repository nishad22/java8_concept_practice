package javaconceptpracticequestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] array = new int[] {5, 1, 7, 3, 9, 6};

        IntStream.rangeClosed(1, array.length).forEach(num -> System.out.println(array[array.length-num]));
    }
}
