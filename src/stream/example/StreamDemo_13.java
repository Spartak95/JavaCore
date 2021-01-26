package stream.example;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo_13 {
    public static void main(String[] args) {
        // ստեղծում ենք տվյալների հոսքին Integer տիպի էլեմենտներով
        Stream<Integer> stream = Stream.of(2, 5, 12, 13, 12, 25, 5, 123);
        // count() մեթոդը հարմարվում է վերջնական օպերացիա
        System.out.println("Տվյալների հոսքում պարունակող " +
                "էլեմենտների քանակը " + stream.count());
        // ստեղծում ենք ցուցակ Integer տիպի էլեմենտներով
        List<Integer> asList = Arrays.asList(2, 5, 12, 13, 12, 25, 5, 123);
        asList.stream().forEach((n) -> System.out.print(n + " "));
        // վերադարձնում է true տրամաբանական արժեք, եթե
        // բոլոր էլեմենտները բավարարում են նշված պայմանին
        // allMatch() մեթոդը հարմարվում է վերջնական օպերացիա
        boolean allMatch = asList.stream().allMatch((n) -> n%2 == 0);
        // վերադարձնում է true տրամաբանական արժեք, եթե
        // էլեմենտներից գոնե մեկը բավարարում է նշված պայմանին
        // anyMatch() մեթոդը հարմարվում է վերջնական օպերացիա
        boolean anyMatch = asList.stream().anyMatch((n) -> n%2 == 0);
        // վերադարձնում է true տրամաբանական արժեք, եթե
        // բոլոր էլեմենտները չեն բավարարում նշված պայմանին
        // noneMatch() մեթոդը հարմարվում է վերջնական օպերացիա
        boolean noneMatch = asList.stream().noneMatch((n) -> n%2 == 0);
        System.out.println("\nallMatch() - " + allMatch);
        System.out.println("anyMatch() - " + anyMatch);
        System.out.println("noneMatch() - " + noneMatch);
        System.out.println("Տվյալների հոսքի միջի կրկնվող էլեմենտները ջնջվում են");
        asList.stream().distinct().forEach((n) -> System.out.print(n + " "));
    }
}

