package multithreading.example;

public class ExtendThread {
    public static void main(String[] args) {
        NewThr t = new NewThr();
        Thread.State ts = t.getState();
        System.out.println(ts);
        if (ts == Thread.State.RUNNABLE){
            System.out.println("Դուստր հոսքը ներկա պահին կատարվում է");
        }
        try{
            for (int i=3; i>0; i--){
                System.out.println("Գլխավոր հոսքը " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Գլխավոր հոսքը ընդհատվեց");
        }
        System.out.println("Գլխավոր հոսքը ավարտվեց");
        Thread.State ts1 = t.getState();
        System.out.println(ts1);
    }
}

