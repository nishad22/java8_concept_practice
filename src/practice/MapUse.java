package practice;


import java.util.Arrays;
import java.util.List;

//. How to use map to convert object into Uppercase in Java 8?
public class MapUse {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("aa", "bbb", "cc", "dd");
        List<String> uppercase = names.stream().map(String::toUpperCase).toList();
        uppercase.forEach(s -> System.out.print(" "+s));
    }
}
