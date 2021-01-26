package multithreading.example;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class DemoTask extends Thread{
    private static Final AtomicInteger nextId   = new AtomicInteger(0);
    public DemoTask(String name) {
        super(name);
        start();
    }
    // Thread local variable containing each thread's ID
    private static Final ThreadLocal<Integer> threadId = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return nextId.getAndIncrement();
        }
    };
    // Returns the current thread's unique ID, assigning it if necessary
    public int getThreadId() {
        return threadId.get();
    }
    // Returns the current thread's starting timestamp
    private static Final ThreadLocal<Date> startDate = new ThreadLocal<Date>() {
        protected Date initialValue() {
            return new Date();
        }
    };
    @Override
    public void run() {
        System.out.printf("Starting Thread: %s : %s\n", getThreadId(), startDate.get());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Thread Finished: %s : %s\n", getThreadId(), startDate.get());
    }
}
