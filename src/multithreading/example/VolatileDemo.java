package multithreading.example;

public class VolatileDemo {
    public static void main(String[] args) {
        VThread_1 vt = new VThread_1();
        VThread_1 vt2 = new VThread_1();
        vt.start();
        vt2.start();
        vt2.counter();
    }
}
