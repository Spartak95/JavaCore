package String.example;

public class SubStringDemo2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("quick brown fox " +
                "jumps over the lazy dog");
        System.out.println("substring() մեթոդը սկսած 16 ինդեքսով");
        System.out.println(sb.substring(16));
        System.out.println("substring() մեթոդը սկսած 16 " +
                "ինդեքսով և վերջացրած 20 ինդեքսով");
        System.out.println(sb.substring(16, 20));
    }
}

