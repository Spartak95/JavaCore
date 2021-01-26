package concurrency.example;

import java.util.concurrent.Semaphore;

public class Q {
    private int n;
    private static Semaphore semCon = new Semaphore(0);
    private static Semaphore semProd = new Semaphore(1);
    public void get(){
        try{
           semCon.acquire();
        }catch (InterruptedException e){
             e.printStackTrace();
        }
        System.out.println("Ստացվել է " + n);
        semProd.release();
    }
    public void put(int n){
        try{
           semProd.acquire();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.n = n;
        System.out.println("Ուղարկվել է " + n);
        semCon.release();
    }
}

