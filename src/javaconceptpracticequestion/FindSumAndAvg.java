package javaconceptpracticequestion;

import java.util.Arrays;
import java.util.OptionalDouble;

public class FindSumAndAvg {
    public static void main(String[] args) {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

        int sum = Arrays.stream(a).sum();
        OptionalDouble avg = Arrays.stream(a).average();

        System.out.println("sum of array element: "+sum);
        avg.ifPresent(num -> System.out.println("avg of array element: "+num));
    }
}
