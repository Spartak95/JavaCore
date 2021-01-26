package stream.example;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo_4 {
    public static void main(String[] args) {
        // ստեղծում ենք ցուցակ, որի էլեմենտները Double տիպի են
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(1.0);
        myList.add(4.0);
        myList.add(9.0);
        myList.add(16.0);
        myList.add(25.0);
        myList.add(36.0);
        // myList ցուցակի էլեմենտների քառակուսի
        // արմատը պատկերվում է նոր տվյալների հոսքում
        Stream<Double> sqrtRootStrm = myList.stream().map((a) -> Math.sqrt(a));
        double productOfSqrtRoots = sqrtRootStrm.reduce(1.0, (a, b) -> a * b);
        System.out.println(productOfSqrtRoots);
    }
}

