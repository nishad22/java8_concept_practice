package defaults;

public interface Interface2  extends Interface1{

    default void methodB(){
        System.out.println("inside method B");
    }

    default void methodA(){
        System.out.println("inside method A"+Interface2.class);
    }
}
