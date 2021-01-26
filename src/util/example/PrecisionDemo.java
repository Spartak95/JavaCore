package util.example;

import java.util.Formatter;

public class PrecisionDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        fmt.format("%.2f", 123.1234567);
        System.out.println(fmt);
        fmt.close();
        fmt = new Formatter();
        fmt.format("%16.3e", 123.1234567);
        System.out.println(fmt);
        fmt.close();
        fmt = new Formatter();
        fmt.format("%12.7g", 123.1234567);
        System.out.println(fmt);
        fmt.close();
        fmt = new Formatter();
        fmt.format("%.6s", "Ֆորմատավորումը Java-ում արդեն շատ հասարակ է");
        System.out.println(fmt);
        fmt.close();
    }
}

