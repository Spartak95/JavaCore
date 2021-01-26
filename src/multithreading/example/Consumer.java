package multithreading.example;

public class Consumer implements Runnable {

    private Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this, "Սպառող").start();
    }

    @Override
    public void run() {
       while (true){
          q.get();
       }
    }

}

