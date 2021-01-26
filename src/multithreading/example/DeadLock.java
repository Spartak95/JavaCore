package multithreading.example;

public class DeadLock implements Runnable {
    A a = new A();
    B b = new B();
    public DeadLock(){
        Thread.currentThread().setName("Գլխավոր հոսքը");
        Thread t = new Thread(this, "Մրցակցող հոսք");
        t.start();
        a.foo(b);
    }
    @Override
    public void run() {
       b.bar(a);
    }
    public static void main(String[] args) {
       DeadLock deadLock = new DeadLock();
    }
}

