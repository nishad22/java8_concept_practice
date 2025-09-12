package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxElement {

    public static void main(String[] args) {
        List<Integer> myList1 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        findMaxValue(myList1);
    }

    private static void findMaxValue(List<Integer> myList1) {
        Optional<Integer> r1 = myList1.stream().max(Comparator.comparing(num -> num));
        r1.ifPresent(s -> System.out.println("find max value by using max(): " + s));

        Optional<Integer> r2 = myList1.stream().reduce((a, b) -> a > b ? a : b);
        r2.ifPresent(s -> System.out.println("find max value by using reduce(): " + s));

        Optional<Integer> r3 = myList1.stream().max(Integer::compare);
        r3.ifPresent(s -> System.out.println("find max value by using max(Integer::compare): " + s));

        Optional<Integer> r4 = myList1.stream().max(Comparator.naturalOrder());
        r4.ifPresent(s -> System.out.println("find max value by using max(Comparator.naturalOrder()): " + s));
    }
}
