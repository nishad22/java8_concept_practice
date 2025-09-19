package javaconceptpracticequestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindStringStartWithNumber {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

        IntStream.range(0,listOfStrings.size())
                .filter(str -> Character.isDigit(listOfStrings.get(str).charAt(0)))
                .forEach(str -> System.out.println(listOfStrings.get(str)));
    }
}
