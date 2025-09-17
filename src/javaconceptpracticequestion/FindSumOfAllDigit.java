package javaconceptpracticequestion;


import java.util.stream.Collectors;
import java.util.stream.Stream;

//Find sum of all digits of a number in Java 8
public class FindSumOfAllDigit {

    public static void main(String[] args) {
        int i = 15623;
        char ch = '7';

        int j = ch -'0';
        System.out.println(j);
        int result = Stream.of(String.valueOf(i).split(""))
                .collect(Collectors.summingInt(Integer::parseInt));

        System.out.println(result);

        int sun = Stream.of(String.valueOf(i).split(""))
                .mapToInt(Integer::parseInt).sum();

        System.out.println(sun);

    }
}
