package functionalInterface;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Double> supplier = Math::random;
        System.out.println("Supplier interface: "+supplier.get());
//        Supplier<String> str = () -> "nishad".toUpperCase();
        Supplier<String> str = "nishad"::toUpperCase;
        System.out.println("Supplier interface result: "+str.get());
    }
}
