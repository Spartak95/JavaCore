package collection.example;

import java.util.HashMap;
import java.util.Map;

public class A {
    public static void main(String[] args) {
        HashMap<String, Integer> map
                = new HashMap<>();
        map.put("a", 10000);
        map.put("b", 55000);
        map.put("c", 44300);
        map.put("e", 100);
        System.out.println("HashMap:\n "
                + map.toString());
        System.out.println("Value of r1:\n " + map.putIfAbsent("d", 77633));
        System.out.println("Value of r2:\n " + map.putIfAbsent("e", 77633));
        System.out.println("New HashMap:\n " + map);
        System.out.println(map.getOrDefault("r", 500));
        Map<String, String> map2 = new HashMap<>();
        map2.put("question", "Bla?");
        System.out.println(map2.merge("question", " Blabla", (oldVal, newVal) -> oldVal + newVal));
        System.out.println(map2.get("question"));
    }
}
