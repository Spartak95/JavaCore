package collection.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Demp {
    public static void main(String[] args) {
        TreeSet<Car> sd = new TreeSet<>();
        sd.add(new Car("BMW"));
        sd.add(new Car("Audi"));
        sd.add(new Car("Nissan"));
        sd.add(new Car("BMW"));
        sd.add(new Car("Opel"));
    }
}
