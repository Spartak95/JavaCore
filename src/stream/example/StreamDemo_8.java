package stream.example;

import java.util.*;
import java.util.stream.*;

public class StreamDemo_8 {
    public static void main(String[] args) {
        // անունների, հեռախոսահամարների և
        // էլեկտրոնային հասցեների ցուցակ
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Լարրի",
                "555-5555", "Larry@HerbSchilt.com"));
        myList.add(new NamePhoneEmail("Ջեյմս",
                "555-4444", "James@HerbSchilt.com"));
        myList.add(new NamePhoneEmail("Մերի",
                "555-3333", "Mery@HerbSchilt.com"));
        // նոր տվյալների հոսքի մեջ պատկերում
        // է միայն անունները և հեռախոսահամարները
        Stream<NamePhone> nameAndPhone = myList.stream().
                map((a) -> new NamePhone(a.name, a.phonenum));
        // կանչում ենք collect() մեթոդին, որպեսզի ստանաք
        // անուններով և հեռախոսահամարներով List տիպի ցուցակը
        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());
        System.out.println("Անուններով և հեռախոսահամարներով List տիպի ցուցակը");
        for (NamePhone e : npList){
            System.out.println(e.name + ": " + e.phonenum);
        }
        System.out.println();
        // ստանում ենք նոր նոր տվյալների հոսքի մեջ պատկերում
        // է միայն անունները և հեռախոսահամարները
        nameAndPhone = myList.stream().
                map((a) -> new NamePhone(a.name, a.phonenum));
        // կանչում ենք collect() մեթոդին, որպեսզի ստանաք
        // անուններով և հեռախոսահամարներով Set տիպի բազմությունը
        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
        System.out.println("Անուններով և հեռախոսահամարներով Set տիպի բազմությունը");
        for (NamePhone e : npSet){
            System.out.println(e.name + ": " + e.phonenum);
        }
    }
}


