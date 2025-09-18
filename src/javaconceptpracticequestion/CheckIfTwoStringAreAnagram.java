package javaconceptpracticequestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CheckIfTwoStringAreAnagram {

    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        List<String> r1 = Arrays.stream(s1.toLowerCase().split("")).sorted(Comparator.naturalOrder()).toList();
       // r1.forEach(System.out::println);

        boolean isAnagram = Arrays.stream(s2.toLowerCase().split(""))
                .sorted(Comparator.naturalOrder())
                .toList().equals(r1);

        System.out.println("are string anagram: "+isAnagram);
    }
}
