package concurrency.example;

import java.util.concurrent.Exchanger;

public class MakeString implements Runnable {
    private Exchanger<String> ex;
    private String str;
    public MakeString(Exchanger<String> ex) {
        this.ex = ex;
        str = new String();
    }
    @Override
    public void run() {
       char ch = 'A';
        for (int i = 0; i < 3 ; i++) {
           // լցնել բուֆերին
            for (int j = 0; j < 5; j++) {
                str += (char) ch++;
            }
            try {
                // լցված բուֆերին փոխանակում են դատարկ բուֆերի հետ
                str = ex.exchange(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

