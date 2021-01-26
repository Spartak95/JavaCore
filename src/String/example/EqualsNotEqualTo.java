package String.example;

public class EqualsNotEqualTo {
    public static void main(String[] args) {
        String s1 = "Բարև";
        String s2 = s1;
        System.out.println(s1 + " հավասար է " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
    }
}

