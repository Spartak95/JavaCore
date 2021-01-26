package util.example;

import java.util.Formatter;

public class FormatDemo_6 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        fmt.format("%3$d %2$d %1$d", 10, 20, 30);
        System.out.println(fmt);
        fmt.close();
        // կարող ենք կրկնակի օգտագործել արգումենտին, առանց նրան երկու անգամ նշելու
        fmt = new Formatter();
        fmt.format("%d թիվը տասվեցական համակարգով կլինի %1$x", 255);
        System.out.println(fmt);
        fmt.close();
        // կարող ենք օգտագործել < նշանին արգումենտի ինդեքսի փոխարեն
        fmt = new Formatter();
        fmt.format("%d թիվը տասվեցական համակարգով կլինի %<x", 255);
        System.out.println(fmt);
        fmt.close();
    }
}

