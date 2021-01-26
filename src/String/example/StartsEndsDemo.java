package String.example;

public class StartsEndsDemo {
    public static void main(String[] args) {
        String str = "Բարև ձեզ, ինչպես եք";
        System.out.println(str.startsWith("Բարև"));
        System.out.println(str.startsWith("արև"));
        System.out.println(str.endsWith("եք"));
        System.out.println(str.startsWith("ինչպես"));
    }
}

