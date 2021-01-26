package String.example;

public class MakeString {
    public static void main(String[] args) {
        char[] c = {'J', 'a', 'v', 'a'};
        String s1 = new String(c);
        String s2 = new String(c, 0, 2);
        String s3 = s1;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

