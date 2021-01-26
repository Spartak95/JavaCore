package stream.example;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo_9 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Լարրի",
                "555-5555", "Larry@HerbSchilt.com"));
        myList.add(new NamePhoneEmail("Ջեյմս",
                "555-4444", "James@HerbSchilt.com"));
        myList.add(new NamePhoneEmail("Մերի",
                "555-3333", "Mery@HerbSchilt.com"));
        Stream<NamePhone> nameAndPhone = myList.stream().
                map((a) -> new NamePhone(a.name, a.phonenum));
        LinkedList<NamePhone> npLinkedList = nameAndPhone.collect(() -> new LinkedList<>(),
                                                      (list, element) -> list.add(element),
                                                     (listA, listB) -> listA.addAll(listB));
        System.out.println("Անուններով և հեռախոսահամարներով LinkedList տիպի կապված ցուցակը");
        for (NamePhone e : npLinkedList) {
            System.out.println(e.name + ": " + e.phonenum);
        }
        System.out.println();
        nameAndPhone = myList.stream().
                map((a) -> new NamePhone(a.name, a.phonenum));
        HashSet<NamePhone> npSet = nameAndPhone.collect(HashSet::new, HashSet::add, HashSet::addAll);
        System.out.println("Անուններով և հեռախոսահամարներով Set տիպի բազմությունը");
        for (NamePhone a : npSet) {
            System.out.println(a.name + ": " + a.phonenum);
        }
    }
}


