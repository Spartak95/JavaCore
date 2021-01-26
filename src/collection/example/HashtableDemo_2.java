package collection.example;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableDemo_2 {
    public static void main(String[] args) {
        Hashtable<Car, Integer> car = new Hashtable<>();
        car.put(new Car("BMW"), 1995);
        car.put(new Car("Toyota"), 2003);
        car.put(new Car("NIVA"), 1999);
        car.put(new Car("KIA"), 2012);
        car.put(new Car("Opel"), 1995);
        car.put(new Car("Opel"), 1996);
        Set<Map.Entry<Car, Integer>> set = car.entrySet();
        for (Map.Entry<Car, Integer> me : set){
            System.out.print(me.getKey() + " - ");
            System.out.println(me.getValue());
        }
    }
}

