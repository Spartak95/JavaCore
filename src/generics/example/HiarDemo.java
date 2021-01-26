package generics.example;

public class HiarDemo {
    public static void main(String[] args) {
        Gen2<String, Integer> x = new Gen2<String, Integer>("Արժեքը հավասար է ", 99);
        System.out.print(x.getOb());
        System.out.print(x.getOb2());
    }
}

