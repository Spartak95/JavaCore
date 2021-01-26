package util.example;

import java.util.Timer;

public class TTest {
    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();
        /*
           տեղադրում է սկզբնական մեկ վայրկյան դադար, իսկ
           հետո ամեն կես վայրկյան հետո նորից կրկնվում է
        */
        myTimer.schedule(myTask, 1000, 500);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myTimer.cancel();
    }
}

