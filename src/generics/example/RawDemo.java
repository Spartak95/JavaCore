package generics.example;

public class RawDemo {

    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen<String> strOb = new Gen<String>("Ընդհանրացում");
        // բազային տիպ
        Gen raw = new Gen(98.6);
        // պահանջվում է տիպի վերափոխում, քանի որ տիպը անհայտ է
        double d = (Double) raw.getOb();
        System.out.println("Արժեքը " + d);
        // ծրագրի կատարման պահին կառաջանա սխալ
        int i = (Integer) raw.getOb();
    }

}

