package enums.example;

public class EnumDemo2 {
    public enum Apple2{
        Jonathan, GoldenDel, RedDel, Winesap, Cortland
    }
    public static void main(String[] args) {
        Apple2 ap;
        System.out.println("Թվարկման Apple տիպի կոնստատներ");
        Apple2[] allapples = Apple2.values();
        for (Apple2 a : allapples){
            System.out.println(a);
        }
        System.out.println();
        ap = Apple2.valueOf("Winesap");
        System.out.println("ap փոփոխականը պարունակում է " + ap);
    }
}

