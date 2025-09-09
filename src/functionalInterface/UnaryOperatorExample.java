package functionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> u1 = (str) -> str.concat("defaults");
    public static void main(String[] args) {
        System.out.println("The unary operator: "+u1.apply("java"));
    }
}
