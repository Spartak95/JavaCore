package collection.example;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDmeo_2 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<String, Double>();
        tm.put("Ջոն Դոու", new Double(3434.34));
        tm.put("Թոմ Սմիթ", new Double(123.22));
        tm.put("Ջեյն Բեյկեր", new Double(1378.00));
        tm.put("Տոդ Հալլ", new Double(99.22));
        tm.put("Ռալֆ Սմիթ", new Double(-19.08));
        // ստանում ենք բազմության էլեմենտները
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for (Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + " ");
            System.out.println(me.getValue());
        }
    }
}

