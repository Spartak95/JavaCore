package collection.example;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // ստեղծում ենք ցուցակային զանգված
        ArrayList<String> al = new ArrayList<String>(); // կամ new ArrayList<>()
        System.out.println("al ցուցակային զանգվածի սկզբնական չափսն է " + al.size());
        // ցուցակային զանգվածի մեջ մտցվում է հետևյալ էլեմենտները
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("al ցուցակային զանգվածի չափսը էլեմենտներին մտցնելուց հետո " + al.size());
        System.out.println("al ցուցակային զանգվածի պարունակությունը " + al);
        // ցուցակային զանգվածի մեջ գտնվող էլեմենտներին ջնջում ենք
        al.remove("F");
        al.remove(2);
        System.out.println("al ցուցակային զանգվածի չափսը էլեմենտներին ջնջելուց հետո " + al.size());
        System.out.println("al ցուցակային զանգվածի պարունակությունը " + al);
    }
}

