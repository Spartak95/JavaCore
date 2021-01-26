package stream.example;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamDemo_6 {
    public static void main(String[] args) {
        // double տիպի արժեքներով ցուցակ
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(1.1);
        myList.add(3.6);
        myList.add(9.2);
        myList.add(4.7);
        myList.add(12.1);
        myList.add(5.0);
        System.out.print("myList ցուցակի ելակետային արժեքները ");
        myList.stream().forEach((a) -> {
            System.out.print(a + " ");
        });
        System.out.println();
        IntStream cStrm = myList.stream().
                mapToInt((a) -> (int) Math.ceil(a));
        System.out.print("myList ցուցակի արժեքների մաքսիմալ թույլատրելի սահմանը ");
        cStrm.forEach((a) -> System.out.print(a + " "));
    }
}


