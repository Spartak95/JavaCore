package collection.example;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2A {
    public static void main(String[] args) {
        CompLastName compLN = new CompLastName();
        Comparator<String> comp = compLN.thenComparing(new CompThenByFirstName());
        TreeMap<String, String> tm = new TreeMap<>(comp);
        tm.put("Ջոն Դոու",  "15000");
        tm.put("Թոմ Սմիթ", "98000");
        tm.put("Ջեյն Բեյկեր", "56000");
        tm.put("Թոդ Հալլ", "23000");
        tm.put("Ռալֆ Սմիթ", "35000");
        Set<Map.Entry<String, String>> entrySet = tm.entrySet();
        for (Map.Entry<String, String> m : entrySet) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
