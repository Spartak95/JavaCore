package concurrency.example;

import java.util.concurrent.Exchanger;

public class UseString implements Runnable {
    private Exchanger<String> ex;
    private String str;
    public UseString(Exchanger<String> ex) {
        this.ex = ex;
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                // դատարկ բուֆերին փոխանակում են լցված բուֆերի հետ
                str = ex.exchange(new String());
                System.out.println("Ստացվել է " + str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

