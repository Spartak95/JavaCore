package multithreading.example;

public class B {
    public synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " մտավ B.bar() մեթոդի մեջ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " փորձում է կանչել A.last() մեթոդը");
        System.out.println(Thread.currentThread().getState());
        a.last();
    }
    public synchronized void last(){
        System.out.println("B.last() մեթոդում");
    }
}

