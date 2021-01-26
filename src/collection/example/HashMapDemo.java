package collection.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        // ստեղծում ենք հեշ-պատկերում
        HashMap<String, Integer> car = new HashMap<String, Integer>();
        // մուտքագրում ենք էլեմենտներին պատկերման մեջ
        car.put("BMW", 1995);
        car.put("Toyota", 2003);
        car.put("NIVA", 1999);
        car.put("KIA", 2012);
        car.put("Opel", 1995);
        car.put("Opel", 1996);
        // ստանում ենք գրանցումների բազմությունը
        Set<Map.Entry<String, Integer>> set = car.entrySet();
        for (Map.Entry<String, Integer> me : set){
            System.out.print(me.getKey() + " - ");
            System.out.println(me.getValue());
        }
        System.out.println("BMW մեքենայի արտադրման տարեթիվը " + car.get("BMW"));
    }
}

