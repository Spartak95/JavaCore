package String.example;

public class SubStringDemo {
    public static void main(String[] args) {
        String str= "quick brown fox " +
                "jumps over the lazy dog";
        System.out.println("substring() մեթոդը սկսած 16 ինդեքսով");
        System.out.println(str.substring(16));
        System.out.println("substring() մեթոդը սկսած 16 " +
                "ինդեքսով և վերջացրած 20 ինդեքսով");
        System.out.println(str.substring(16, 20));
    }
}

