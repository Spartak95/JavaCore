package concurrency.example;

public class Producer implements Runnable {
    private Q q;
    public Producer(Q q) {
        this.q = q;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 7; i++) {
           q.put(i);
        }
    }
}

