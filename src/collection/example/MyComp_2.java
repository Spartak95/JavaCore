package collection.example;

import java.util.Comparator;

public class MyComp_2 implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
}

