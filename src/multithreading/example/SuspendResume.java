package multithreading.example;

public class SuspendResume {
    public static void main(String[] args) {
        NThread t1 = new NThread("Առաջին");
        NThread t2 = new NThread("Երկրորդ");
        try {
            Thread.sleep(1000);
            t1.mysuspend();
            System.out.println("Առաջին հոսքը դադարեցրեց կատարումը");
            Thread.sleep(1000);
            t1.myresume();
            System.out.println("Առաջին հոսքը վերսկսեց կատարումը");
            t2.mysuspend();
            System.out.println("Երկրորդ հոսքը դադարեցրեց կատարումը");
            Thread.sleep(1000);
            t2.myresume();
            System.out.println("Երկրորդ հոսքը վերսկսեց կատարումը");
        } catch (InterruptedException e) {
            System.out.println("Գլխավոր հոսքը ընդհատվեց");
        }
        // գլխավոր հոսքը սպասում է երկու հոսքերի ավարտին
        try {
            t1.t.join();
            t2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Գլխավոր հոսքը ընդհատվեց");
        }
        System.out.println("Գլխավոր հոսքը ավարտվեց");
    }
}

