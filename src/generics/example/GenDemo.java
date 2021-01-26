package generics.example;

public class GenDemo {
    public static void main(String[] args) {
        // ստեղծվում է Gen տիպի օբյեկտ ամբողջական թվերի համար
        // T տիպին վերագրում ենք Integer տիպը
        Gen<Integer> iOb = new Gen<Integer>(88);
        // ցուցադրում է T-ի տիպը
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Արժեքը: " + v);
        System.out.println();
        // ստեղծվում է Gen տիպի օբյեկտ սիմվոլային տողերի համար
        Gen<String > strOb = new Gen<>("Թեստային ընդհանրացում");
        // ցուցադրում է T-ի տիպը
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Արժեքը: " + str);
    }
}

