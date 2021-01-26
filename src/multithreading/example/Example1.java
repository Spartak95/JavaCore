package multithreading.example;

public class Example1 {
    static void runExampleThread(Thread t) {
        System.out.println(Thread.currentThread().getName() + " thread Example1 կլասսի մեջ");
        printState("Thread-1 մինչև start()", t);
        t.start();
        printState("Thread-1 start() կանչելիս", t);
        printState("Main thread sleeping for 1/2 sec", t);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printState("main thread woke up", t);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            printState("shutting down", t);
        }));
    }

    static void printState(String msg, Thread t) {
        System.out.printf("%s - %s state: %s%n", msg, t.getName(),
                t.getState());
    }

}
