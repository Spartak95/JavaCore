package collection.example;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<Integer>();
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        System.out.print("vals ցուցակային զանգվածի պարունակությունը ");
        for (Integer a : vals){
            System.out.print(a + " ");
        }
    }
}

