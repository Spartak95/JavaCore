package multithreading.example;

public class CurrentThreadDemo{
    public static void main(String[] args) {
      Thread t = Thread.currentThread();
        System.out.println("Ընթացիկ կատարող հոսքը " + t);
        t.setName("My Thread");
        System.out.println("Կատարող հոսքի անունը փոխելուց հետո " + t);
        try{
           for (int i=5; i>0; i--){
               System.out.println(i);
               Thread.sleep(1000);
           }
        }catch (InterruptedException e){
            System.out.println("Գլխավոր կատարող հոսքը ընդհատվեց");
        }
    }
}

