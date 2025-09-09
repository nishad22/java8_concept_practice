package streamapi;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnBoxing {

    public static void main(String[] args) {
        System.out.println("getBoxedList(): "+getBoxedList());
        System.out.println("unBoxing(): "+unBoxing());
    }

    private static List<Integer> getBoxedList() {
        //primitive to wrapper
        return IntStream.range(1,20)
                .boxed()
                .toList();
    }

    private static int unBoxing() {
        //wrapper to primitive
        return getBoxedList().stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
