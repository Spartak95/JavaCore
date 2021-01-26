package multithreading.example;

public class Synch {

    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Բարի գալուստ", "A");
        Caller ob2 = new Caller(target, "սինխրոնիզացված", "B");
        Caller ob3 = new Caller(target, "աշխարհ", "C");
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Ընդհատվեց");
        }
    }

}

