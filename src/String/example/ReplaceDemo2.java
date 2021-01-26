package String.example;

public class ReplaceDemo2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Սա հասարակ տող է");
        System.out.println(sb);
        sb.replace(3, 10, "փոփոխված");
        System.out.println(sb);
    }
}

