package collection.example;

import java.util.Properties;
import java.util.Set;

public class PropDemoRef {
    public static void main(String[] args) {
        Properties defList = new Properties();
        defList.put("Արարատ", "Արարատը");
        defList.put("Արմավիր", "Արմավիրը");
        Properties capitals = new Properties(defList);
        capitals.put("Շիրակ", "Գյումրին");
        capitals.put("Լոռի", "Վանաձորը");
        capitals.put("Կոտայք", "Հրազդանը");
        capitals.put("Սյունիք", "Կապանը");
        capitals.put("Տավուշ", "Իջևանը");
        // ստանում ենք բանալիների բազմություն
        Set<?> s = capitals.keySet();
        for (Object name : s){
            System.out.println(name + " մարզի մարզկենտրոն է "
                    + capitals.getProperty((String) name));
        }
        System.out.println();
        String st = capitals.getProperty("Արարատ");
        System.out.println("Արարատ մարզի մարզկենտրոն է " + st);
    }
}

