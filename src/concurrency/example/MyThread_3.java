package concurrency.example;

import java.util.concurrent.Phaser;

public class MyThread_3 implements Runnable {
    private Phaser phsr;
    private String name;
    public MyThread_3(Phaser phsr, String name) {
        this.phsr = phsr;
        this.name = name;
        phsr.register();
    }
    @Override
    public void run() {
        System.out.println(name + " հոսքը սկսում է առաջին փուլը");
        // փուլին հասնելու մասին տեղեկացնում է
        phsr.arriveAndAwaitAdvance();
        // Փոքր դադար, որպեսզի չխախտվի դուրս բերման հաջորդականությունը,
        // բայց պարտադիր չէ փուլի ճիշտ ֆունկցիոնալ սինխրոնիզացման համար
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " հոսքը սկսում է երկրորդ փուլը");
        // փուլին հասնելու մասին տեղեկացնում է
        phsr.arriveAndAwaitAdvance();
        // Փոքր դադար, որպեսզի չխախտվի դուրս բերման հաջորդականությունը,
        // բայց պարտադիր չէ փուլի ճիշտ ֆունկցիոնալ սինխրոնիզացման համար
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " հոսքը սկսում է երրորդ փուլը");
        // փուլին հասնելու մասին տեղեկացնում է և գրանցումից հանում է հոսքին
        phsr.arriveAndDeregister();
    }
}


