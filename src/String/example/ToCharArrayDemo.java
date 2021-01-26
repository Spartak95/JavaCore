package String.example;

public class ToCharArrayDemo {
    public static void main(String[] args) {
        String str = "Բարի գալուստ Java";
        char[] ch = str.toCharArray();
        for (int i=0; i<ch.length; i++){
            System.out.print(ch[i] + " ");
        }
    }
}

