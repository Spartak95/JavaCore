package concurrency.example;

public class Consumer implements Runnable {
    private Q q;
    public Consumer(Q q) {
        this.q = q;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 7; i++) {
            q.get();
        }
    }
}

