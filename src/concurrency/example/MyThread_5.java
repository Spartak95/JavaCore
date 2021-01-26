package concurrency.example;

import java.util.concurrent.CountDownLatch;

public class MyThread_5 implements Runnable {
    private String name;
    private CountDownLatch cdl;
    public MyThread_5(CountDownLatch cdl, String name) {
        this.cdl = cdl;
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            cdl.countDown();
        }
    }
}

