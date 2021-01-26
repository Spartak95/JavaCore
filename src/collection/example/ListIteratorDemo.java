package collection.example;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        System.out.print("al ցուցակային զանգվածի պարունակությունը\n");
        ListIterator<String> itr = al.listIterator();
        itr.next();
        itr.add("T");
        System.out.println(al);
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        while (itr.hasPrevious()){
            System.out.print(itr.previous() + " ");
        }
    }
}

