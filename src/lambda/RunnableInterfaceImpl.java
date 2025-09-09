package lambda;

public class RunnableInterfaceImpl {
    public static void main(String[] args) {

        /*Runnable impl with normal*/
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Implemented by creating anonymous class");
            }
        };
        new Thread(runnable).start();

        /*implementing with Lambda */

        Runnable runnableLambda = () -> {
            System.out.println("Implemented using lambda");
        };
        new Thread(runnableLambda).start();

        /*Lambda with one line*/

        Runnable runnableLambda1 = () -> System.out.println("Implemented using lambda in one line");
        new Thread(runnableLambda1).start();

        /*Passing Lambda directly in thread*/
        new Thread(() -> System.out.println("Implemented using lambda in thread object directly")).start();
    }
}
