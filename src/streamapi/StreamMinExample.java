package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 3, 45, -1, 72, 4);
        if (findMinValue(integerList).isPresent())
            System.out.println("Min value: " + findMinValue(integerList).get());
    }

    /**
     * don't use default value to calculate the min value as it will as return zero
     * @param integerList
     * @return
     */
    private static Optional<Integer> findMinValue(List<Integer> integerList) {
        return integerList.stream().reduce((a,b) -> a < b ? a :b);
    }
}
