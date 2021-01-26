package stream.example;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo_11 {
    public static void main(String[] args) {
        // ստեղծվում է ցուցակ սիմվոլային տողով
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Ալֆա");
        myList.add("Բետա");
        myList.add("Գամմա");
        myList.add("Դելտա");
        myList.add("Քսի");
        myList.add("Օմեգա");
        // ստանում ենք տվյալների հոսք ArrayList տիպի ցուցակից
        Stream<String> stream = myList.stream();
        // ստանում ենք իտերատոր բաժանարար տվյալների հոսքի համար
        Spliterator<String> split = stream.spliterator();
        while (split.tryAdvance(n -> System.out.println(n)));
    }
}

