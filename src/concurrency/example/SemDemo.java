package concurrency.example;

import java.util.concurrent.Semaphore;

public class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        IncThread it = new IncThread(sem, "A");
        DecThread dt = new DecThread(sem, "B");
        Thread t1 = new Thread(it);
        Thread t2 = new Thread(dt);
        t1.start();
        t2.start();
    }
}

