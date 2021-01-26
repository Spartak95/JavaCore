package collection.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class CollectionsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);
        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(ll, r);
        System.out.println("Դասակարգված ցուցակը նվազման կարգով");
        for (int i : ll){
            System.out.print(i + " ");
        }
        System.out.println();
        Collections.shuffle(ll);
        System.out.println("Խառնված էլեմենտներով ցուցակը");
        for (int i : ll){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Նվազագույնը " + Collections.min(ll));
        System.out.println("Առավելագույնը " + Collections.max(ll));
    }
}

