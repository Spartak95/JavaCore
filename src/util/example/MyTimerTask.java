package util.example;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Ժամանակաչափով առաջադրանքը կատարվում է");
    }
}

