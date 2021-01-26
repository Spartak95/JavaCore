package concurrency.example;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThread_2 implements Runnable {
    private CyclicBarrier cbar;
    private String name;
    public MyThread_2(CyclicBarrier cbar, String name) {
        this.cbar = cbar;
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name);
        try {
            cbar.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

