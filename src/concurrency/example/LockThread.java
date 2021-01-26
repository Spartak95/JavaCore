package concurrency.example;

import java.util.concurrent.locks.ReentrantLock;

// կատարող հոսքը ինկրեմատացնում է հաշվիչի արժեքը
public class LockThread implements Runnable {
    private String name;
    private ReentrantLock lock;
    public LockThread(ReentrantLock lock, String name) {
        this.lock = lock;
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " հոսքը մեկնարկել է");
        try {
            System.out.println(name + " հոսքը սպասում է հաշվիչի արգելափակմանը");
            lock.lock();
            System.out.println(name + " հոսքը արգելափակում է հաշվիչին");
            Shared.count++;
            System.out.println(name + " հոսքը : " + Shared.count);
            System.out.println(name + " հոսքը սպասում է");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            // հանվում է արգելափակումը
            System.out.println(name + " հոսքը հանում է հաշվիչի արգելափակումը");
            lock.unlock();
        }
    }
}

