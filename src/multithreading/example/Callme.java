package multithreading.example;

public class Callme {

    public void call(String msg){
        synchronized (this) {
            System.out.print(Thread.currentThread().getName() + " - ");
            System.out.print("[" + msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Ընդհատվեց");
            }
            System.out.println("]");
        }
    }
    // ավելացված
    public void call2(String msg){
        synchronized (this) {
            System.out.print(Thread.currentThread().getName() + " - ");
            System.out.print("[" + msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Ընդհատվեց");
            }
            System.out.println("]");
        }
    }
//    // ավելացված
    public void call3(String msg){
        System.out.print(Thread.currentThread().getName() + " - ");
        System.out.print("[" + msg);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Ընդհատվեց");
        }
        System.out.println("]");
    }
//    // ավելացված
//    public synchronized void call4(String msg){
//        System.out.print(Thread.currentThread().getName() + " - ");
//        System.out.print("[" + msg);
//        try{
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            System.out.println("Ընդհատվեց");
//        }
//        System.out.println("]");
    //}
}

