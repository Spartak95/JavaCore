package multithreading.example;

public class ThreadDemo {
    public static void main(String[] args) {
        NewThread t = new NewThread();
        try{
            for (int i=5; i>0; i--){
                System.out.println("Գլխավոր հոսքը " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Գլխավոր հոսքը ընդհատվեց");
        }
        System.out.println("Գլխավոր հոսքը ավարտվեց");
    }
}

