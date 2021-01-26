package multithreading.example;

public class A {
    public synchronized  void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " մտավ A.foo() մեթոդի մեջ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " փորձում է կանչել B.last() մեթոդը");
        System.out.println(Thread.currentThread().getState());
        b.last();

    }
    public synchronized void last(){
        System.out.println("A.last() մեթոդում");
    }
}

