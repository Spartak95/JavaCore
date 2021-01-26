package String.example;

public class EqualsDemo {
    public static void main(String[] args) {
        String s1 = "Բարև";
        String s2 = "Բարև";
        String s3 = "Հաջող";
        String s4 = "ՀԱՋՈՂ";
        System.out.println(s1 + " հավասար է " + s2 + " -> " + s1.equals(s2));
        System.out.println(s2 + " հավասար է " + s3 + " -> " + s2.equals(s3));
        System.out.println(s3 + " հավասար է " + s4 + " -> " + s3.equalsIgnoreCase(s4));
    }
}

