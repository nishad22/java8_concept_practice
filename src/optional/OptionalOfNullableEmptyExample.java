package optional;

import java.util.Optional;

public class OptionalOfNullableEmptyExample {

    public static void main(String[] args) {
        System.out.println("getStringNullable(): "+getStringNullable());
        System.out.println("getStringempty(): "+getStringempty());
        System.out.println("getStringOf(): "+getStringOf());
    }

    /**
     * This behavior is useful when you're not sure if a value could be null.
     * Instead of throwing a NullPointerException (which happens if you use the of() method with null),
     * ofNullable() provides a safe way to create an Optional that represents the absence of a value with an empty state.
     * @return
     */
    private static Optional<String> getStringNullable(){
//        Optional<String> str = Optional.ofNullable("Hello");
        Optional<String> str = Optional.ofNullable(null);
        return str;
    }

    private static Optional<String> getStringOf(){
        Optional<String> str = Optional.of(null);
        return str;
    }

    private static Optional<String> getStringempty(){
        return Optional.empty();
    }
}
