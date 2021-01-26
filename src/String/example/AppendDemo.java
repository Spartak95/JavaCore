package String.example;

public class AppendDemo {
    public static void main(String[] args) {
        String s;
        int a = 42;
        StringBuffer sb  = new StringBuffer(40);
        s = sb.append("a = ").append(a).append("!").toString();
        System.out.println(s);
        StringBuffer sb2  = new StringBuffer("abcd");
        String s2 = sb2.append("ef").toString();
        System.out.println(s2);
    }
}

