package first.example;

public class ReturnDemo {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Այս տողը կկատարվի");
        if (t) return;
        System.out.println("Այս տողը չի կատարվի");
    }
}

