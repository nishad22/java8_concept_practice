package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 3, 45, 0, 72, 4);
        System.out.println("Max value: " + findMaxValue(integerList));

        List<Integer> integerList1 = new ArrayList<>();
        //in case max value would be 0 because it's a default value.
        // To tackle this kind of situation we use Optional which handle empty and null case gracefully
        System.out.println("Max value: " + findMaxValueWithoutDefaultValue(integerList1));
    }

    /**
     * below method uses reduce terminal operation to find the max value from a list
     * here default is 0 so it will perform operation like this
     * initially, x = 0 & y = 10, 0>10 , y = 10 and for next iteration value will be x = 3, y = 10 and so on
     * @param integerList
     * @return
     */
    private static int findMaxValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (x, y) -> x > y ? x : y);
    }

    private static Optional<Integer> findMaxValueWithoutDefaultValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce((x, y) -> x > y ? x : y);
    }
}
