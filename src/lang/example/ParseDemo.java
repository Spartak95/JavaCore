package lang.example;

public class ParseDemo {
    public static void main(String[] args) {
        String s = "56";
        byte b = Byte.parseByte(s);
        int i = Integer.parseInt(s);
        System.out.println("b = " + b);
        System.out.println("i = " + i);
    }
}

