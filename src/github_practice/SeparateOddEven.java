package github_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddEven {

    public static void main(String[] args) {

//        IntStream intStream = IntStream.range(1,10);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenList = list.stream()
                .filter(i -> i % 2 == 0)
                .toList();

        List<Integer> oddList = list.stream()
                .filter(i -> i % 2 != 0)
                .toList();

        System.out.println(evenList);
        System.out.println(oddList);

        System.out.println("-----------by using partitioning by----------");

        Map<Boolean,List<Integer>> map = list.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(map);

    }
}
