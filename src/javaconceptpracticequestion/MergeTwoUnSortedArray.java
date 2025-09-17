package javaconceptpracticequestion;

import java.util.Arrays;
import java.util.stream.IntStream;

//How do you merge two unsorted arrays into single sorted array using Java 8 streams?
public class MergeTwoUnSortedArray {

    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        int[] result = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).toArray();
        System.out.println(Arrays.toString(result));

       IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().forEach(System.out::println);
    }
}
