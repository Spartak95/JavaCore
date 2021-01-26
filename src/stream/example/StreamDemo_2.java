package stream.example;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo_2 {
    public static void main(String[] args) {
        // ստեղծվում է Integer տիպի օբյեկտների ցուցակ
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        // myList ցուցակի էլեմենտների բազմապատկման արդյունքի
        // ստացումը երկու եղանակով reduce() մեթոդի օգնությամբ
        Optional<Integer> productObj = myList.stream().reduce((a, b) -> a * b);
        if (productObj.isPresent()){
            System.out.println("Բազմապատկման արդյունքը Optional " +
                    "տիպի օբյեկտի տեսքով " + productObj.get());
        }
        int product = myList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Բազմապատկման արդյունքը int " +
                "տիպի  փոփոխականի տեսքով " + product);
        int evenProduct = myList.stream().reduce(1, (a, b) -> {
            if (b%2 == 0) return a*b; else return a;
        });
        System.out.println("Զույգ թվերի բազմապատկման արդյունքը int " +
                "տիպի  փոփոխականի տեսքով " + evenProduct);
    }
}

