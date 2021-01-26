package concurrency.example;

public class AtomicDecThread implements Runnable {
    private String name;
    public AtomicDecThread(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " հոսքի մեկնարկ");
        for (int i = 0; i <= 3; i++) {
            System.out.println(name + " " + Shared_2.ai.get());
        }
    }
}
