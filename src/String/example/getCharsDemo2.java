package String.example;

public class getCharsDemo2 {
    public static void main(String[] args) {
        char[] dst = {'a', 'b','d','r','e','f'};
        String s = "cd";
        for (char ch : dst){
            System.out.print(ch);
        }
        System.out.println();
        s.getChars(0, 2, dst, 2);
        System.out.println(dst);
        for (char ch : dst){
            System.out.print(ch);
        }
    }
}

