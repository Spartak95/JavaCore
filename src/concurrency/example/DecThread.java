package concurrency.example;

import java.util.concurrent.Semaphore;

// Կատարող հոսքը հաշվիչի արժեքը փոքրացնում է մեկով
public class DecThread implements Runnable{
    private String name;
    private Semaphore sem;
    public DecThread(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " հոսքի մեկնարկը");
        try {
            // սկզբից ստանում ենք թույլատրություն
            System.out.println(name + " հոսքը սպասում է թույլատրությանը");
            sem.acquire();
            System.out.println(name + " հոսքը ստանում է թույլատրությունը");
            // իսկ հիմա ստանում ենք ընդհանուր ռեսուրսի մուտքը
            for (int i=0; i<5; i++){
                Shared.count--;
                System.out.println(name + ": " + Shared.count);
            }
            // թույլատրում է մի համատեքստի անցումը մեկ այլ համատեքստի
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        // ազատում է թույլատրությանը
        System.out.println(name + " հոսքը ազատում է թույլատրությանը");
        sem.release();
    }
}


