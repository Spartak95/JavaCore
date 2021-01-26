package concurrency.example;

// կատարող հոսք, որտեղ ինկրեմենտացնում է հաշվիչի արժեքը
public class AtomIncThread implements Runnable {
     private String name;
     public AtomIncThread(String name) {
         this.name = name;
     }
     @Override
     public void run() {
          System.out.println(name + " հոսքի մեկնարկ");
          for (int i = 0; i <= 3; i++) {
               System.out.print(name + " ");
               Shared_2.ai.incrementAndGet();
          }
     }
}

