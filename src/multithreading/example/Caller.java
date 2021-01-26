package multithreading.example;

public class Caller extends Thread implements Runnable{

    private String msg;
    private Callme target;
    public Thread t;

    public Caller(Callme target, String msg, String name) {
        this.msg = msg;
        this.target = target;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
         synchronized (Callme.class) {
              //...
         }
    }

}


