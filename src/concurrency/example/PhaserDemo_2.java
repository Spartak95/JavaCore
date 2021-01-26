package concurrency.example;

public class PhaserDemo_2 {
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1, 4);
        System.out.println("Հոսքերի մեկնարկ");
        new Thread(new MyThread_4(phsr, "A")).start();
        new Thread(new MyThread_4(phsr, "B")).start();
        new Thread(new MyThread_4(phsr, "C")).start();
        // սպասում է որոշակի քանակի փուլի ավարտին
        if (!phsr.isTerminated()){
            phsr.arriveAndDeregister();
        }
    }
}

