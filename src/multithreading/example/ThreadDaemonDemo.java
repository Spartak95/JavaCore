package multithreading.example;

public class ThreadDaemonDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        System.out.println("t1 " + t1.isDaemon());
        System.out.println("t2 " + t2.isDaemon());
    }
}

