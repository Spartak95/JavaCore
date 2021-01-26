package first.example;

public class IncDecDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b; // c = 3;
        d = a++; // d = 1;
        c++; // c = 4;
        System.out.println("a = " + a); // a = 2
        System.out.println("b = " + b); // b = 3
        System.out.println("c = " + c); // c = 4
        System.out.println("d = " + d); // d = 1
    }
}

