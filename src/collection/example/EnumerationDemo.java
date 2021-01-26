package collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class EnumerationDemo {
    public static void main(String[] args) {
        ArrayList<String> dayNames = new ArrayList<>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        Enumeration<String> days = Collections.enumeration(dayNames);
        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }
}

