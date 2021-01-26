package collection.example;

import java.util.Properties;
import java.util.Set;

public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
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
        String st = capitals.getProperty("Արարատ", "չի հայտնաբերվել");
        System.out.println("Արարատ մարզի մարզկենտրոնը " + st);
    }
}

