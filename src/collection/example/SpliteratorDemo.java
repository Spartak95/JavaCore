package collection.example;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<Double>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        Spliterator<Double> splitr = vals.spliterator();
        System.out.println("vals ցուցակային զանգվածի պարունակությունը");
        while (splitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();
        System.out.println("Մնացած էլեմենտների քանակը, որը պետք է իտերացվի " + splitr.estimateSize());
        splitr = vals.spliterator();
        System.out.println("Մնացած էլեմենտների քանակը, որը պետք է իտերացվի " + splitr.estimateSize());
        System.out.println();
        ArrayList<Double> sqrs = new ArrayList<Double>();
        while (splitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
        System.out.println("sqrs ցուցակային զանգվածի պարունակությունը");
        splitr = sqrs.spliterator();
        splitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}

