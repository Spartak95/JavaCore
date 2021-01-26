package collection.example;

import java.util.Comparator;

public class MyComp implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        // կատարում է համեմատում հակառակ կարգով
        return b.compareTo(a);
    }
}

