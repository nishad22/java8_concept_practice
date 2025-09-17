package javaconceptpracticequestion;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        listOfStrings = listOfStrings.stream()
                .distinct()
                .toList();

        System.out.println(listOfStrings);
    }
}
