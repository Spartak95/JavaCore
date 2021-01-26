package collection.example;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        hs.add("Բետա");
        hs.add("Ալֆա");
        hs.add("Էտա");
        hs.add("Գամմա");
        hs.add("Էպսիլոն");
        hs.add("Օմեգա");
        for (String s : hs){
            System.out.println(s);
        }
    }
}

