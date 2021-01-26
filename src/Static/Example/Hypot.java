package Static.Example;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Hypot {
    public static void main(String[] args) {
        double side1 = 3.0;
        double side2 = 4.0;
        double hypot;
        hypot = sqrt(pow(side1, 2) + pow(side2, 2));
        System.out.println("Ուղղ. եռանկյան կողմերը " + side1 + " և " +
                side2 + " երկարությունների\nդեպքում " +
                "ներքնաձիգը հավասար է " + hypot);
    }
}


