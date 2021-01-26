package String.example;

public class ToStringDemo {
    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String s = "b օբյեկտը Box տիպի է: " + b;
        System.out.println(b);
        System.out.println(s);
    }
}

