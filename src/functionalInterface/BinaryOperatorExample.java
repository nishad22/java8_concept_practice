package functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer> b1 = (a,b) -> a*b;
    static Comparator<Integer> c1 = (a,b) -> a.compareTo(b);

    public static void main(String[] args) {
        System.out.println("binary operator: "+b1.apply(3,4));
        BinaryOperator<Integer> b2 = BinaryOperator.maxBy(c1);
        System.out.println("maxBy in BinaryOperator: "+b2.apply(3,4));
    }
}
