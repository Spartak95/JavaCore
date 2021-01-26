package first.example;

public class ShortenedBoolOpDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = (!a & b) || (a & !b);
        boolean d = (!a & b) && (a & !b);
        System.out.println("c = " + c); // true
        System.out.println("d = " + d); // false
    }
}

