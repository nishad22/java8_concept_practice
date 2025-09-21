import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class session {

    public static void main(String[] args) {
        String s = "string data to count each character";
        countTheChar(s);
        String inputString = "Java Concept Of The Day";
        nonRepeatedChar(inputString);
        reverseTheWord(inputString);
        findAge();
    }

    private static void findAge() {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(1985,01,23);


    }

    //    Reverse each word of a string using Java 8 streams
    private static void reverseTheWord(String inputString) {
         Arrays.stream(inputString.split(" "))
                .map(str -> new StringBuilder(str).reverse())
                .forEach(str -> System.out.print(str +" "));
    }

    //Find first non-repeated character in a string?
    private static void nonRepeatedChar(String inputString) {
        Set<String> set = new HashSet<>();
        Arrays.stream(inputString.toLowerCase().split(""))
                .filter(set::add)
                .findFirst()
                .ifPresent(System.out::println);

    }

    //Write a program to print the count of each character in a String?
    private static void countTheChar(String s) {
       Map<String,Long> map =  Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        System.out.println(map);
    }

}
