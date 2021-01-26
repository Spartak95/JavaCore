package multithreading.example;

public class NewThr extends Thread {
    public NewThr(){
        super("Ցուցադրական հոսք");
        System.out.println("Դուստր հոսքը " + this);
        start();
    }
    @Override
    public void run() {
        try {
            for (int i=3; i>0; i--){
                System.out.println("Դուստր հոսքը " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Դուստր հոսքը ընդհատվեց");
        }
        System.out.println("Դուստր հոսքը ավարտվեց");
    }
}

