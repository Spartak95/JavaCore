package collection.example;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo_2 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);;
        v.addElement(5);
        v.addElement(6);
        v.addElement(7);
        v.addElement(8);
        System.out.println("Էլեմենտների դուրս բերում իտերատորի օգնությամբ");
        Iterator<Integer> it = v.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("Էլեմենտների դուրս բերում for each ցիկլի օգնությամբ");
        for (int i : v){
            System.out.print(i + " ");
        }
    }
}

