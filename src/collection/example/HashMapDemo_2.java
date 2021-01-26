package collection.example;

import java.util.HashMap;

public class HashMapDemo_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> car = new HashMap<String, Integer>();
        car.put("BMW", 1995);
        car.put("Toyota", 2003);
        car.put("NIVA", 1999);
        car.put("KIA", 2012);
        car.put("Opel", 1995);
        car.compute("Toyota", (key, val) -> val + 12);
        car.computeIfAbsent("FIAT", key -> 2018);
        car.computeIfPresent("NIVA", (key, val) -> val + 15);
        car.replace("Opel", 1995, 2009);
        System.out.println("car.containsKey(\"BMW\") - " + car.containsKey("BMW"));
        System.out.println("car.containsValue(1995) - " + car.containsValue(1995));
        System.out.println("car.size() - " + car.size());
        car.putIfAbsent("Range Rover", 2013);
        car.merge("Nissan", 2012, (key, val) -> val + 5);
        System.out.println(car.getOrDefault("BMW", 2003));
        System.out.println(car.getOrDefault("Tesla", 2018));
        System.out.println("Պատկերման մեջ գտնվող բոլոր բանալիները " + car.keySet());
        System.out.println("Պատկերման մեջ գտնվող բոլոր արժեքները " + car.values());
        System.out.println();
        car.forEach((key, value) -> System.out.println(key + "-" + value));
        car.replaceAll((key, value) -> 2020);
        System.out.println();
        car.forEach((key, value) -> System.out.println(key + "-" + value));
    }
}

