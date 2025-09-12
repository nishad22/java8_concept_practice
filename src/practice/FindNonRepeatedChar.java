package practice;


import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a String, find the first non-repeated character in it using Stream functions?
public class FindNonRepeatedChar {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";

        Stream<Character> charStream = input.chars().mapToObj(ch -> (char) ch); //gives character stream
        Set<Character> charSet = new LinkedHashSet<>();

//        charStream.forEach( ch -> System.out.print(ch+" "));

        charStream
                .forEach(charSet::add);//ch -> charSet.add(ch)

        Optional<Character> result = charSet.stream().findFirst();
        result.ifPresent(s -> System.out.println("find first value: " + s));

        Character result1 = input.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result1);


        Character result2 = input.chars().mapToObj(c -> (char) c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch)) //indexOf() -> the index of the first occurrence of the character in the character sequence
                .findFirst().orElse(null);

        System.out.println("find first value: " + result2);
    }
}
