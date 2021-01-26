package generics.example;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb = new NonGen(88);
        iOb.showType();
        int v = (Integer)iOb.getOb();
        System.out.println("Արժեքը: " + v);
        System.out.println();
        NonGen strOb = new NonGen("Թեստը առանց ընդհանրացմամբ");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("Արժեքը: " + str);
        iOb = strOb;
        v = (Integer) iOb.getOb();
    }
}

