package collection.example;

import java.util.Comparator;
import java.util.TreeSet;

public class MixedCompDemo {
    public static void main(String[] args) {
        TreeSet<Integer> values = new TreeSet<Integer>(Comparator.reverseOrder());
        values.add(212);
        values.add(324);
        values.add(435);
        values.add(566);
        values.add(133);
        values.add(100);
        values.add(121);
        System.out.println(values);
        TreeSet<Integer> values2 = new TreeSet<Integer>(Comparator.naturalOrder());
        values2.add(212);
        values2.add(324);
        values2.add(435);
        values2.add(566);
        values2.add(133);
        values2.add(100);
        values2.add(121);
        System.out.println(values2);
    }
}

