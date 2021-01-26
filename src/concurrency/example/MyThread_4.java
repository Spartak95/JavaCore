package concurrency.example;

import java.util.concurrent.Phaser;

public class MyThread_4 implements Runnable{
    private Phaser phsr;
    private String name;
    public MyThread_4(Phaser phsr, String name) {
        this.phsr = phsr;
        this.name = name;
        phsr.register();
    }
    @Override
    public void run() {
        while (!phsr.isTerminated()){
            System.out.println(name + " հոսքը սկսում է " + phsr.getPhase() + " փուլը");
            phsr.arriveAndAwaitAdvance();
            // Փոքր դադար, որպեսզի չխախտվի դուրս բերման հաջորդականությունը,
            // բայց պարտադիր չէ փուլի ճիշտ ֆունկցիոնալ սինխրոնիզացման համար
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

