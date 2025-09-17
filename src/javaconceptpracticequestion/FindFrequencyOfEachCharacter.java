package javaconceptpracticequestion;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFrequencyOfEachCharacter {

    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day";

        Stream<Character> characterStream = inputString.toLowerCase().chars().mapToObj(ch -> (char) ch);

       Map<Character,Long> result1 = characterStream
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(result1);


        String[] arr = {"Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil"};

        Map<String,Long> result2 = Arrays.stream(arr)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

        System.out.println(result2);

    }
}
