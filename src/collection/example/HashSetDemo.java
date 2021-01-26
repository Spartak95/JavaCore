package collection.example;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
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

