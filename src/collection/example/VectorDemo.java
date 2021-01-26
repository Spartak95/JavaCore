package collection.example;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // վեկտորի սկզբնական չափը 3, իսկ ինկրեմենտը 2
        Vector<Integer> v = new Vector<Integer>(3, 2);
        System.out.println("Վեկտորի սկզբնական չափը " + v.size());
        System.out.println("Վեկտորի սկզբնական տարողությունը " + v.capacity());
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("Չորս էլեմենտ ավելացնելուց հետո վեկտորի տարողությունը կլինի " + v.capacity());
        v.addElement(5);
        System.out.println("Վեկտորի տարողությունը կլինի " + v.capacity());
        v.addElement(6);
        v.addElement(7);
        v.addElement(8);
        System.out.println("Վեկտորի տարողությունը կլինի " + v.capacity());
        System.out.println("Վեկտորում գտնվող առաջին էլեմենտը " + v.firstElement());
        System.out.println("Վեկտորում գտնվող վերջին էլեմենտը " + v.lastElement());
        if (v.contains(3)){
            System.out.println("Վեկտորը պարունակում է 3");
        }
        Enumeration<Integer> e = v.elements();
        while (e.hasMoreElements()){
            System.out.print(e.nextElement() + " ");
        }
    }
}

