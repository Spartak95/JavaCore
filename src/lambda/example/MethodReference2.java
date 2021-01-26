package lambda.example;

public class MethodReference2 {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Thread is running...");
        Thread t = new Thread(r);
        t.start();
    }
}
