package generics.example;

import java.util.ArrayList;
import java.util.List;

public class BoundsDemo {
    public static void main(String[] args) {
       Integer[] inums = {1, 2, 3, 4, 5};
       Stats<Integer> iOb = new Stats<Integer>(inums);
       double v = iOb.average();
       System.out.println("iOb միջին արժեքը հավասար է " + v);
       Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
       Stats<Double> dOb = new Stats<Double>(dnums);
       double w = dOb.average();
       System.out.println("dOb միջին արժեքը հավասար է " + w);
       // Այս կոդը չի կոմպիլացվի, քանի որ String կլասսը
       // չի հանդիսանում Number կլասսի ենթակլասսը
       // String[] strs = {"1", "2", "3", "4", "5"};
       // Stats<String> strOb = new Stats<String>(strs);
       // double x = strOb.average();
       // System.out.println("strOb միջին արժեքը հավասար է " + x);
    }
}

