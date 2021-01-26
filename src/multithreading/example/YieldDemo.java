package multithreading.example;

public class YieldDemo implements Runnable {
    @Override
    public void run() {
        int counter = 0;
        while (counter < 2) {
            System.out.println(Thread.currentThread()
                    .getName() + " - " + counter++);
            Thread.yield();
        }
    }
}

