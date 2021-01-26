package collection.example;

import java.util.ArrayList;

public class ArrayListDemo_2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        for (String s : al){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("Զանգվածի առաջին ինդեքսին " +
                "պատկանող էլեմենտը կլինի " + al.get(1));
        al.set(0, "R");
        for (String s : al){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(al.contains("E"));
        al.clear();
        System.out.println(al.size());
        System.out.println(al.isEmpty());
    }
}

