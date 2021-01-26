package first.example;

public class EqualOpDemo {
    public static void main(String[] args) {
        int a = 12;
        int b = 26;
        int c = 3;
        int d = 6;
        int e = 6;
        boolean boo, boo_2, boo_3, boo_4, boo_5, boo_6;
        boo = b != c;
        boo_2 = d == e;
        boo_3 = a < b;
        boo_4 = c >= d;
        boo_5 = e > b;
        boo_6 = b <= e;
        System.out.println("boo = " + boo); // true
        System.out.println("boo_2 = " + boo_2); // true
        System.out.println("boo_3 = " + boo_3); // true
        System.out.println("boo_4 = " + boo_4); // false
        System.out.println("boo_5 = " + boo_5); // false
        System.out.println("boo_6 = " + boo_6); // false
    }
}

