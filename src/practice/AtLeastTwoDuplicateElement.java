package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//11. Given an integer array nums, return true if any value appears at least twice in the array
// return false if every element is distinct.
public class AtLeastTwoDuplicateElement {

    public static void main(String[] args) {
        int[] arr = {10, 15, 8, 49, 25, 98, 98, 32, 15};

        List<Integer> list = Arrays.stream(arr).boxed().toList();
        list.forEach(num -> System.out.print(num+" "));
        Set<Integer> set  = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        System.out.println("\n");
        set.forEach(num -> System.out.print(num+" "));

        if (list.size() != set.size()){
            System.out.println("\nDuplicate present: "+true);
        } else {
            System.out.println("\nDistinct element: "+false);
        }

        Set<Integer> set1 = new HashSet<>();
        boolean bool = Arrays.stream(arr).anyMatch(num -> !set1.add(num));
        System.out.println("using anyMatch(): "+bool);
    }

}
