package util.example;

import java.util.Formatter;

public class FormatDemo_5 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        fmt.format("% d", -100);
        System.out.println(fmt);
        fmt = new Formatter();
        fmt.format("% d", 100);
        System.out.println(fmt);
        fmt = new Formatter();
        fmt.format("%+d", 100);
        System.out.println(fmt);
        fmt = new Formatter();
        fmt.format("%(d", -100);
        System.out.println(fmt);
        fmt = new Formatter();
        fmt.format("%,.2f", 4356783497.34);
        System.out.println(fmt);
    }
}

