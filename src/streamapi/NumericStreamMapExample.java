package streamapi;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    public static void main(String[] args) {
        System.out.println("mapToObj: "+mapToObj());
        System.out.println("mapToLong: "+mapToLong());

    }

    //below example according java 9 as new Integer(i) deprecated
    private static List<Integer> mapToObj() {
        return IntStream.rangeClosed(1,5)
                .mapToObj((i) -> {
                    return i;
                })
                .toList();
    }

    private static long mapToLong() {
        return IntStream.rangeClosed(1,5)
                .mapToLong(i -> i)
                .sum();
    }
}
