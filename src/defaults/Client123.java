package defaults;

public class Client123 implements Interface1, Interface2, Interface3 {

    public void methodA(){
        System.out.println("inside method A"+Client123.class); //
    }

    // 1 -> class implements the interface
    // 2 -> the sub interface that extend the interface

    public static void main(String[] args) {

        Client123 client123 = new Client123();
        client123.methodA();
        client123.methodB();
        client123.methodC();
    }
}
