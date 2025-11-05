package github_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElement {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Set<String> stringSet = new HashSet<>();
        names = names.stream()
                .filter(str -> stringSet.add(str))
                .toList();

        System.out.println(names);

        names = names.stream()
                .distinct()
                .toList();

        System.out.println(names);

    }
}
