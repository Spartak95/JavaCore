package inheritance.example;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        // սուպեր կլասսը կարող է ինքնուրույն օգտագործել
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("superOb օբյեկտի պարունակությունը");
        superOb.showij();
        System.out.println();
        // ենթակլասսը մուտք ունի իր սուպեր կլասսի բոլոր բաց անդամների հանդեպ
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("subOb օբյեկտի պարունակությունը");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("i, j և k գումարը subOb օբյեկտում");
        subOb.sum();
    }
}

