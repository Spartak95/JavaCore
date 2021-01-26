package multithreading.example;

public class NewThread_1 implements Runnable{
    private String name;
    public Thread t;
    public NewThread_1(String name){
        this.name = name;
        t = new Thread(this, name);
        System.out.println("Նոր հոսք " + t);
        t.start();
    }
    @Override
    public void run() {
        try{
            for (int i=5; i>0; i--){
                System.out.println(name + " " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name + " ընդհատվեց");
        }
        System.out.println(name + " ավարտվեց");
    }
}

