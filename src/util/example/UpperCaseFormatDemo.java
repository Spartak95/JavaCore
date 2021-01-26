package util.example;

import java.util.Formatter;

public class UpperCaseFormatDemo {
    public static void main(String[] args) {
        Formatter  fmt = new Formatter();
        fmt.format("%X", 250);
        System.out.println(fmt);
        fmt.close();
        fmt = new Formatter();
        fmt.format("%B", true);
        System.out.println(fmt);
        fmt.close();
        fmt = new Formatter();
        fmt.format("%E", 123.1234);
        System.out.println(fmt);
        fmt.close();
    }
}

