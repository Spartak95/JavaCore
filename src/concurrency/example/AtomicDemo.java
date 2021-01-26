package concurrency.example;

public class AtomicDemo {
    public static void main(String[] args) throws InterruptedException {
         Thread thread = new Thread(new AtomIncThread("A"));
         thread.start();
         Thread thread2 = new Thread(new AtomIncThread("B"));
         thread2.start();
    }
}

