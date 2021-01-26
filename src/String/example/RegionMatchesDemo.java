package String.example;

public class RegionMatchesDemo {
    public static void main(String[] args) {
        String s1 = "Բարև ձեզ, ինչպես եք";
        String s2 = "ինչպես";
        String s3 = "ԻՆՉՊԵՍ";
        System.out.println(s1.regionMatches(10, s2, 0, 6));
        System.out.println(s1.regionMatches(10, s2, 1, 6));
        System.out.println(s1.regionMatches(true,10, s2, 0, 6));
    }
}

