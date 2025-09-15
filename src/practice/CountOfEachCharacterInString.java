package practice;


import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Write a program to print the count of each character in a String?
public class CountOfEachCharacterInString {

    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        Stream<Character> characterStream = input.toLowerCase().chars().mapToObj(ch -> (char)ch);

        Map<Character,Long> map = characterStream
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(map);

    }
}
