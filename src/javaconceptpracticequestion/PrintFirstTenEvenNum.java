package javaconceptpracticequestion;

import java.util.stream.IntStream;

public class PrintFirstTenEvenNum {

    public static void main(String[] args) {

        IntStream.rangeClosed(1,20)
                .filter(num ->num%2==0)
                .forEach(num -> System.out.print(num+" "));
    }
}
