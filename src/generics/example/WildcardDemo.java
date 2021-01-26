package generics.example;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats2<Number> iOb = new Stats2<Number>(inums);
        double v = iOb.average();
        System.out.println("iOb միջին արժեքը հավասար է " + v);
        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats2<Double> dOb = new Stats2<Double>(dnums);
        double w = dOb.average();
        System.out.println("dOb միջին արժեքը հավասար է " + w);
        Float[] fnums = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Stats2<Float> fOb = new Stats2<Float>(fnums);
        double x = fOb.average();
        System.out.println("fOb միջին արժեքը հավասար է " + x);
        System.out.print("iOb և dOb միջին արժեքները ");
        if (iOb.sameAvg(dOb)){
            System.out.println("հավասար է");
        }else
            System.out.println("տարբերվում են");
        System.out.print("iOb և fOb միջին արժեքները ");
        if (iOb.sameAvg(fOb)){
            System.out.println("հավասար է");
        }else
            System.out.println("տարբերվում են");

    }
}

