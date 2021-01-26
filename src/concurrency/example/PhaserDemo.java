package concurrency.example;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhase;
        System.out.println("Հոսքերի մեկնարկ");
        new Thread(new MyThread_3(phsr, "A")).start();
        new Thread(new MyThread_3(phsr, "B")).start();
        new Thread(new MyThread_3(phsr, "C")).start();
        // սպասում է առաջին փուլի բոլոր կատարող հոսքերի ավարտին
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println(curPhase + " առաջին փուլի ավարտ");
        // սպասում է երկրորդ փուլի բոլոր կատարող հոսքերի ավարտին
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println(curPhase + " երկրորդ փուլի ավարտ");
        // սպասում է երրորդ փուլի բոլոր կատարող հոսքերի ավարտին
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println(curPhase + " երրորդ փուլի ավարտ");
        // գրանցումից հանում է գլխավոր կատարող հոսքին
        phsr.arriveAndDeregister();
        if (phsr.isTerminated()){
            System.out.println("Փուլի սինխրոնիզատորը ավարտել է");
        }
    }
}

