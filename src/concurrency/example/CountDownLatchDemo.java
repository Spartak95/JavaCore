package concurrency.example;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(4);
        Worker w1 = new Worker(1000, cdl, "Աշխատող-1");
        Worker w2 = new Worker(2000, cdl, "Աշխատող-2");
        Worker w3 = new Worker(3000, cdl, "Աշխատող-3");
        Worker w4 = new Worker(4000, cdl, "Աշխատող-4");
        w1.start();
        w2.start();
        w3.start();
        w4.start();
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.currentThread().setName("Գլխավոր հոսքը");
        System.out.println(Thread.currentThread().getName() + " ավարտել է");
    }
}

