package lang.example;

public class NewThread extends Thread{
    private boolean suspendFlag;
    public NewThread(String threadName, ThreadGroup tgOb) {
        super(tgOb, threadName);
        System.out.println("Նոր հոսք " + this);
        suspendFlag = false;
        start();
    }
    // կատարող հոսքում մուտքի կետ
    @Override
    public void run() {
      try{
          for (int i=5; i>0; i--){
              System.out.println(getName() + ": " + i);
              Thread.sleep(1000);
              synchronized (this){
                  while (suspendFlag){
                      wait();
                  }
              }
          }
      }catch (InterruptedException e) {
          e.printStackTrace();
      }
      System.out.println(getName() + " ավարտվել է");
    }
    public synchronized void mysuspend(){
        suspendFlag = true;
    }
    public synchronized void myresume(){
        suspendFlag = false;
        notify();
    }
}



