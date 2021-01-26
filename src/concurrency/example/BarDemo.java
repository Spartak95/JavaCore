package concurrency.example;

import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());
        System.out.println("Կատարող հոսքերի մեկնարկը");
        new Thread(new MyThread_2(cb, "A")).start();
        new Thread(new MyThread_2(cb, "B")).start();
        new Thread(new MyThread_2(cb, "C")).start();
    }
}

