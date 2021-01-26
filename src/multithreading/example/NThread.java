package multithreading.example;

public class NThread implements Runnable{
    // կատարող հոսքի անունը
    private String name;
    public Thread t;
    private boolean suspendFlag;

    public NThread(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("Նոր հոսքը " + t);
        suspendFlag = false;
        t.start(); // մեկնարկում է կատարող հոսքը
    }
    // մուտքի կետը կատարող հոսքում
    @Override
    public void run() {
        try {
            for (int i=15; i>0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(200);
//                synchronized (this){
//                    while (suspendFlag){
//                        wait();
//                    }
//                }
                syn();
            }
        }catch (InterruptedException e){
            System.out.println(name + " ընդհատվեց");
        }
        System.out.println(name + " ավարտվեց");
    }
    public synchronized void mysuspend(){
        suspendFlag = true;
    }
    // իմ ավելացրած մեթոդը
    public synchronized void syn(){
        while (suspendFlag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void myresume(){
        suspendFlag = false;
        notify();
    }
}

