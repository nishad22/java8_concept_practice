package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitAndSkipExample {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(10, 3, 45, 2, 4, 5);

        // here it will consider only 10 & 3 as limit is 2
        Optional<Integer> resultLimit = integerList.stream()
                .limit(2)
                .reduce(Integer::sum);

       resultLimit.ifPresent(result -> System.out.println("Limit result: " + result));

        //in below case first 3 element will skip
        Optional<Integer> resultSkip = integerList.stream()
                .skip(3) // 2,4,5 will be passed to stream
                .reduce(Integer::sum);

        resultSkip.ifPresent(integer -> System.out.println("Skip result: " + integer));

    }
}
