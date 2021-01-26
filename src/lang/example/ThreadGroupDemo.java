package lang.example;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("A խումբ");
        ThreadGroup groupB = new ThreadGroup("B խումբ");
        NewThread ob1 = new NewThread("Առաջին", groupA);
        NewThread ob2 = new NewThread("Երկրորդ", groupA);
        NewThread ob3 = new NewThread("Երրորդ", groupB);
        NewThread ob4 = new NewThread("Չորրորդ", groupB);
        System.out.println("\nlist() մեթոդից դուրս է բերվում");
        groupA.list();
        groupB.list();
        System.out.println("A խումբը ընդհատվում է");
        Thread[] tga = new Thread[groupA.activeCount()];
        // A խմբից ստանում է կատարող հոսքերին
        groupA.enumerate(tga);
        for (int i=0; i<tga.length; i++){
        // ընդհատում է ամեն կատարող հոսքին
            ((NewThread)tga[i]).mysuspend();
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Գլխավոր կատարող հոսքը ընդհատվել է");
        }
        System.out.println("A խումբը վերսկսում է իր կատարումը");
        for (int i=0; i<tga.length; i++){
            // վերսկսում է բոլոր կատարող հոսքերի կատարումը
            ((NewThread)tga[i]).myresume();
        }
        try {
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Գլխավոր կատարող հոսքի կատարումը ավարտվեց");
    }
}

