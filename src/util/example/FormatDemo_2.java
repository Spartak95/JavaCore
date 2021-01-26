package util.example;

import java.util.Formatter;

public class FormatDemo_2 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        for (double i=1.23; i<1.0e+6; i*=100){
            fmt.format("%f %e", i, i);
            System.out.println(fmt);
        }
        Formatter fmt2 = new Formatter();
        fmt2.format("196 թիվը 16-ական համակարգով կլինի %x, " +
                "և 123 թիվը 8-ական համակարգով կլինի %o", 196, 123);
        System.out.println(fmt2);
        fmt.close();
    }
}

