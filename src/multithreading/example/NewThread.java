package multithreading.example;

public class NewThread implements Runnable{
    public NewThread(){
        // ստեղծվում է երկրորդ նոր կատարող հոսքը
        Thread t = new Thread(this, "Ցուցադրական հոսքը");
        System.out.println("Դուստր հոսքը ստեղծված է " + t);
        t.start(); // կատարող հոսքը մեկնարկում է
    }
    // երկրորդ կատարող հոսքի մուտքի կետը
    @Override
    public void run() {
      try {
          for (int i=5; i>0; i--){
              System.out.println("Դուստր հոսքը " + i);
              Thread.sleep(500);
          }
      }catch (InterruptedException e){
          System.out.println("Դուստր հոսքը ընդհատվեց");
      }
        System.out.println("Դուստր հոսքը ավարտվեց");
    }
}

