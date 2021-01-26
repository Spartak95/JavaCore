package stream.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo_10 {
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
        // ստանում ենք իտերատոր տվյալների հոսքի համար
        Iterator<String> itr = stream.iterator();
        // տվյալների հոսքի ամեն էլեմենտի վրայով հաջորդական անցում է կատարում
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

