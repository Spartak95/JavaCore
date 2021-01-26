package stream.example;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo_12 {
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
        // ստանում ենք առաջին իտերատոր բաժանարարին
        Spliterator<String> split = stream.spliterator();
        // ստանում ենք երկրորդ իտերատոր բաժանարարին
        Spliterator<String> split2 = split.trySplit();
        // սկզբից օգտագործվում ենք split2 իտերատոր բաժանարարին
        if (split2 != null){
            System.out.println("split2 իտերատոր բաժանարարից դուրս բերվող արժեքը");
            split2.forEachRemaining((n) -> System.out.println(n));
        }
        System.out.println();
        // իսկ հիմա օգտագործում ենք split իտերատոր բաժանարարին
        System.out.println("split իտերատոր բաժանարարից դուրս բերվող արժեքը");
        split.forEachRemaining((n) -> System.out.println(n));
    }
}

