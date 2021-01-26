package multithreading.example;

public class ThreadPriority {
    public static void main(String[] args) {
        NewThr1 t1 = new NewThr1("Առաջին");
        NewThr1 t2 = new NewThr1("Երկրորդ");
        t1.t.setPriority(10);
        t2.t.setPriority(2);
    }
}
