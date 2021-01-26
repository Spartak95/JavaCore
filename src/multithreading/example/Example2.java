package multithreading.example;

public class Example2 {
    public static void main(String[] args)  {
        new Thread(() -> {
            synchronized (Example2.class) {
                try {
                    System.out.println(Thread.currentThread().getName() + " thread Example2 կլասսի մեջ");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        MyTask t = new MyTask();
        t.setName("Thread-1");
        Example1.runExampleThread(t);
    }
    private static class MyTask extends Thread {
        @Override
        public void run() {
            Example1.printState("attempting to enter synchronized block", this);
            synchronized (Example2.class) {
                Example1.printState("entered synchronized block", this);
            }
            Example1.printState("Thread_1 ավարտվեց", this);
        }
    }
}
