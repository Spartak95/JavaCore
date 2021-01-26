package enums.example;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple1 ap, ap2, ap3;
        System.out.println("Բոլոր խնձորի տեսակների կոնստանտները " +
                "իրենց հաջորդականության արժեքով");
        for (Apple1 a : Apple1.values()){
            System.out.println(a + " " + a.ordinal());
        }
        ap = Apple1.RedDel;
        ap2 = Apple1.GoldenDel;
        ap3 = Apple1.RedDel;
        System.out.println();
        if(ap.compareTo(ap2) < 0){
            System.out.println(ap + " նախորդում է " + ap2);
        }
        if(ap.compareTo(ap2) > 0){
            System.out.println(ap + " նախորդում է " + ap2);
        }
        if(ap.compareTo(ap3) == 0){
            System.out.println(ap + " հավասար է " + ap3);
        }
        System.out.println();
        if (ap.equals(ap2)){
            System.out.println("Սխալ է");
        }
        if (ap.equals(ap3)){
            System.out.println(ap + " հավասար է " + ap3);
        }
        if (ap == ap3){
            System.out.println(ap + " հավասար է " + ap3);
        }
    }
}

