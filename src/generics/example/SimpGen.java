package generics.example;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "ընդհանրացում");
        tgObj.showTypes();
        int v = tgObj.getOb1();
        System.out.println("Արժեքը " + v);
        String str = tgObj.getOb2();
        System.out.println("Արժեքը " + str);
    }
}

