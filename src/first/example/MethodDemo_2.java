package first.example;

public class MethodDemo_2 {
    public static void main(String[] args) {
        byte a = a((byte) 12);
        int cv = c(564);
        String s = str("Hello World");
        System.out.println(a);
        System.out.println(cv);
        System.out.println(s);
    }
    static byte a(byte b){
        return b;
    }
    static int c(int d){
        return d;
    }
    static String str(String sd){
        return sd;
    }
}

