package multithreading.example;

public class VThread_1 extends Thread{
    private int a;
    @Override
    public void run() {
      while (a < 10){
          System.out.println(a++);
      }
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void counter(){
        System.out.println(a);
    }
}
