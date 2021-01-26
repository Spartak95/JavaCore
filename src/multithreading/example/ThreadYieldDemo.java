package multithreading.example;

public class ThreadYieldDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new YieldDemo(), "A");
        Thread t2 = new Thread(new YieldDemo(), "B");
        t1.start();
        t2.start();
    }
}

