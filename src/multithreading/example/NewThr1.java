package multithreading.example;

public class NewThr1 implements Runnable{
    private String name;
    public Thread t;
    public NewThr1(String name){
        this.name = name;
        t = new Thread(this, name);
        System.out.println("Նոր հոսք " + t);
        t.start();
    }
    @Override
    public void run() {
        for (int i=5; i>0; i--){
            System.out.println(name + " " + i);
        }
        System.out.println(name + " ավարտվեց");
    }
}
