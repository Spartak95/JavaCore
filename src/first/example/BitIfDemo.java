package first.example;

public class BitIfDemo {
    public static void main(String[] args) {
        int a = 0b1010;
        int b = 0b1100;
        int c;
        int d;
        int e;
        c = a | b; // c = 14;
        d = a ^ b; // d = 6;
        e = ~a & a | b; // e = 12; -> օպերացիան կատարվում է ձախից աջ
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}

