package String.example;

public class ValueOfDemo {
    public static void main(String[] args) {
        int i = 10;
        float f = 10.10f;
        long l = 111L;
        double d = 2222.22;
        char ch = 'A';
        char[] array = {'a', 'b', 'c'};
        String str1 = String.valueOf(i);
        String str2 = String.valueOf(f);
        String str3 = String.valueOf(l);
        String str4 = String.valueOf(d);
        String str5 = String.valueOf(ch);
        String str6 = String.valueOf(array);
        String str7 = String.valueOf(array, 0, 3);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
    }
}

