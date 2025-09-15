package practice;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//How to find only duplicate elements with its count from the String ArrayList in Java8?
public class FindDuplicateElement {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

        List<String> duplicateList = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(map -> map.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("by using grouping(): "+duplicateList);

        Map<String,Long> namesCount = names
                .stream()
                .filter(x-> Collections.frequency(names, x)>1)
                .collect(Collectors.groupingBy
                        (Function.identity(), Collectors.counting()));
        System.out.println("by using Collections.frequency(): "+namesCount);


    }
}
