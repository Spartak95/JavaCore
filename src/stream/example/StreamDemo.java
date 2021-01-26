package stream.example;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // ստեղծում է ցուցակային զանգված Integer տիպի արժեքով
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Ելակետային ցուցակը " + myList);
        // ցուցակային զանգվածից ստանում ենք տվյալների հոսքին
        Stream<Integer> myStream = myList.stream();
        // տվյալների հոսքից ստանում ենք նվազագույն արժեքը
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent()){
            System.out.println("Նվազագույն արժեքը " + minVal.get());
        }
        // ստանում ենք նոր տվյալների հոսք, քանի որ
        // նախորդ min() մեթոդի կանչը դառել էր վերջնական
        // օպերացիա և սպառել էր տվյալների հոսքին
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (minVal.isPresent()){
            System.out.println("Առավելագույն արժեքը " + maxVal.get());
        }
        // կանոնակարգվում է տվյալների հոսքը
        Stream<Integer> sortedStream = myList.stream().sorted();
        // պատկերվում է կանոնակարգված տվյալների հոսքը
        System.out.print("Կանոնակարգված տվյալների հոսքը ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();
        // դուրս է բերում միայն կենտ ամբողջական արժեքները
        Stream<Integer> oddVals = myList.stream().sorted().filter((n) -> (n % 2) == 1);
        System.out.print("Կենտ արժեքները ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();
        // դուրս է բերում այն արժեքները, որոնք մեծ են 5-ից
        oddVals = myList.stream().filter((n) -> (n % 2) == 1).filter((n) -> n > 5);
        System.out.print("Կենտ արժեքները, որոնք մեծ են հինգից ");
        oddVals.forEach((n) -> System.out.print(n + " "));
    }
}

