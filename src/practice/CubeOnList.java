package practice;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Java 8 program to perform cube on list elements and filter numbers greater than 50.
public class CubeOnList {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        List<Integer> cube = integerList.stream()
                .map(num -> num*num*num) //got cube stream
                .filter(num -> num>50)
                .toList();

        cube.forEach(num -> System.out.print(num+" "));
    }
}