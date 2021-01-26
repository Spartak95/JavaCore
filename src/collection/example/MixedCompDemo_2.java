package collection.example;

import java.util.Comparator;
import java.util.TreeSet;

public class MixedCompDemo_2 {
    public static void main(String[] args) {
        TreeSet<Integer> values =
           new TreeSet<Integer>(Comparator.nullsFirst(Comparator.naturalOrder()));
        values.add(212);
        values.add(324);
        values.add(null);
        values.add(566);
        values.add(null);
        values.add(100);
        values.add(null);
        System.out.println(values);
        TreeSet<Integer> values2 =
            new TreeSet<Integer>(Comparator.nullsLast(Comparator.naturalOrder()));
        values2.add(212);
        values2.add(324);
        values2.add(null);
        values2.add(566);
        values2.add(null);
        values2.add(100);
        values2.add(null);
        System.out.println(values2);
    }
}

