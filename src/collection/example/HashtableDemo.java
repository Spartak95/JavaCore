package collection.example;

import java.util.*;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Car, Integer> car = new Hashtable<>();
        car.put(new Car("BMW"), 1995);
        car.put(new Car("Toyota"), 2003);
        car.put(new Car("NIVA"), 1999);
        car.put(new Car("KIA"), 2012);
        car.put(new Car("Opel"), 1995);
        car.put(new Car("Opel"), 1996);
        Enumeration<Car> e = car.keys();
        while (e.hasMoreElements()){
            Car c = e.nextElement();
            System.out.println(c + ", արտադրման տարեթիվը " + car.get(c));
        }
    }
}

