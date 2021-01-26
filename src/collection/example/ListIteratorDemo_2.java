package collection.example;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo_2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        System.out.println("al ցուցակային զանգվածի պարունակությունը " + al);
        ListIterator<String> itr = al.listIterator();
        itr.next();
        itr.set("Z");
        System.out.println("al ցուցակային զանգվածի պարունակությունը " + al);
        while (itr.hasNext()){
            System.out.print(itr.nextIndex() + "-" + itr.next() + " " );
        }
        System.out.println();
        while (itr.hasPrevious()){
            System.out.print(itr.previousIndex() + "-" + itr.previous() + " " );
        }
        System.out.println();
        itr.next();
        itr.next();
        itr.remove();
        System.out.println("al ցուցակային զանգվածի պարունակությունը " + al);
    }
}

