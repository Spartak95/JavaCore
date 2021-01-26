package stream.example;

import java.util.ArrayList;

public class StreamDemo_3 {
    public static void main(String[] args) {
        // ստեղծում ենք ցուցակ, որի էլեմենտները Double տիպի են
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(1.0);
        myList.add(4.0);
        myList.add(9.0);
        myList.add(16.0);
        myList.add(25.0);
        myList.add(36.0);
        double productOfSqrRoots = myList.parallelStream().
                reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * b);
        System.out.println(productOfSqrRoots);
    }
}

