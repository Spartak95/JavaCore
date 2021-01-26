package collection.example;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> car = new TreeMap<String, Integer>();
        car.put("BMW", 1995);
        car.put("Toyota", 2003);
        car.put("NIVA", 1999);
        car.put("KIA", 2012);
        car.put("Opel", 1995);
        Set<Map.Entry<String, Integer>> set = car.entrySet();
        for (Map.Entry<String, Integer> me : set){
            System.out.print(me.getKey() + " - ");
            System.out.println(me.getValue());
        }
    }
}

