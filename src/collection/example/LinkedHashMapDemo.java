package collection.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    private static Final int MAX_ENTRIES = 5;
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>() {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > MAX_ENTRIES;
            }
        };
        lhm.put(0, "H");
        lhm.put(1, "E");
        lhm.put(2, "L");
        lhm.put(3, "L");
        lhm.put(4, "O");
        System.out.println(lhm);
        lhm.put(5, "Hi!");
        System.out.println(lhm);
    }
}

