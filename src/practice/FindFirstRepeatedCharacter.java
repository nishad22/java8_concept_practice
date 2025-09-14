package practice;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstRepeatedCharacter {

    public static void main(String[] args) {
        String input = "Java".toLowerCase();
        Stream<Character> charStream = input.chars().mapToObj(ch -> (char) ch);
        Character result = charStream
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting())) //LinkedHashMap<Character,Long>
                .entrySet()
                .stream()
                .filter(key -> key.getValue() > 1L)
                .map(Map.Entry::getKey)
                .findFirst().get();

        System.out.println("the result: " + result);

        Set<Character> setChar = new HashSet<>();
        for(char ch : input.toCharArray()){
            boolean isPresent = setChar.add(ch);
            System.out.println("isPresent: "+ch +" -> "+isPresent);
        }
    }
}
