package javaconceptpracticequestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostRepeatedElement {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // Comparator.reverseOrder(), the "minimum" becomes the "maximum" of the original values
                .findFirst()
                .ifPresent(map ->
                        System.out.println("Most repeated element in a map: "+map.getKey() +" occurring "+map.getValue()+" times"));


        listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().min(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .ifPresent(map ->
                        System.out.println("Most repeated element in a map using min(): "+map.getKey() +" occurring "+map.getValue()+" times"));

        listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(map ->
                        System.out.println("Most repeated element in a map using max(): "+map.getKey() +" occurring "+map.getValue()+" times"));

    }
}
