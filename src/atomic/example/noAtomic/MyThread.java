package atomic.example.noAtomic;

public class MyThread extends Thread {
    public MyThread() {
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Shared.ai++;
        }
    }
}

