package stream.example;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo_5 {
    public static void main(String[] args) {
        // անունների, հեռախոսահամարների և էլեկտրոնային հասցեների ցուցակ
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Լարրի",
                "555-5555", "Larry@HerbSchilt.com"));
        myList.add(new NamePhoneEmail("Ջեյմս",
                "555-4444", "James@HerbSchilt.com"));
        myList.add(new NamePhoneEmail("Մերի",
                "555-3333", "Mery@HerbSchilt.com"));
        System.out.println("myList ցուցակի ելակետային էլեմենտները");
        myList.stream().forEach((NamePhoneEmail a) -> {
            System.out.println(a.name + " " + a.phonenum + " " + a.email);
        });
        System.out.println();
        Stream<NamePhone> nameAndPhone = myList.stream()
                .map((NamePhoneEmail a) -> new NamePhone(a.name, a.phonenum));
        System.out.println("Անունների և հեռախոսահամարների ցուցակ");
        nameAndPhone.forEach((a) -> {
            System.out.println(a.name + " " + a.phonenum );
        });
        System.out.println();
        Stream<NamePhone> filter = myList.stream().filter(a -> a.name.equals("Ջեյմս"))
                .map((NamePhoneEmail a) -> new NamePhone(a.name, a.phonenum));
        System.out.println("Ֆիլտրրված ցուցակ");
        filter.forEach((a) -> {
            System.out.println(a.name + " " + a.phonenum );
        });
    }
}


