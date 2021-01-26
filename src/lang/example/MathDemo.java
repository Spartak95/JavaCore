package lang.example;

import static java.lang.StrictMath.E;

public class MathDemo {
    public static void main(String args[])
    {
        double a = 30;
        double b = Math.toRadians(a);
        System.out.println(Math.sin(b));
        a = 45;
        b = Math.toRadians(a);
        System.out.println(Math.sin(b));
        a = 60;
        b = Math.toRadians(a);
        System.out.println(Math.cos(b));
        a = 90;
        b = Math.toRadians(a);
        System.out.println(Math.tan(b));
        int v = 452673, t = 45676;
        long v2 = 452673, t2 = 45676;
        System.out.println(Long.toBinaryString(v));
        System.out.println(Long.toBinaryString(t));
        System.out.println(Math.multiplyHigh(v2, t2));
    }
}

