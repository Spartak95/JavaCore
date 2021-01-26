package HomeWork;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("name", "Spo");
        hm.put("name2", "Spo2");
        System.out.println(hm.get("name"));
        System.out.println(hm.get("name2"));
        System.out.println("-----------");
        System.out.println(hm.computeIfPresent("name3", (k, v) -> "569"));
        System.out.println(hm.merge("name", "785", (k, v) -> "865"));
        System.out.println(hm.get("name"));
        System.out.println(hm.get("name2"));
        System.out.println(hm.get("name3"));
        System.out.println(hm.get("name4"));
        System.out.println(hm.size());
    }
}

