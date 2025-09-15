package practice;

import java.util.Arrays;
import java.util.stream.IntStream;

//Write a Java 8 program to sort an array and then convert the sorted array into Stream?
public class ConvertIntoSortedStream {

    public static void main(String[] args) {
        int arr[] = {99, 55, 203, 99, 4, 91};
        IntStream intStream = Arrays.stream(arr).sorted();
        intStream.forEach(System.out::println);
    }
}
