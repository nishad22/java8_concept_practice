package javaconceptpracticequestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWordInString {

    public static void main(String[] args) {
        String str = "Java Concept Of The Day";


        String result = Arrays.stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));



        System.out.println(result);

    }
}
