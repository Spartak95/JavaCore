package collection.example;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        System.out.print("al ցուցակային զանգվածի պարունակությունը ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}

