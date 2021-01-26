package multithreading.example;

public class Q {
    private int n;
    private boolean valueSet;
    public synchronized int get(){
        while (!valueSet){
            try {
              wait();
              Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Ստացել է " + n);
        valueSet = false;
        notify();
        return n;
    }
    public synchronized void put(int n){
        while (valueSet){
            try {
                wait();
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Ուղարկվել է " + n);
        notify();
    }
}

