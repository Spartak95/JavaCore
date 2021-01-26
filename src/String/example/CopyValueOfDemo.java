package String.example;

public class CopyValueOfDemo {
    public static void main(String[] args) {
        char[] Str1 = {'բ', 'ա', 'ր', 'ի', ' ', 'գ',
                'ա', 'լ', 'ո', 'ւ', 'ս', 'տ'};
        String Str2 = "";
        Str2 = String.copyValueOf(Str1);
        System.out.println(Str2);
        Str2 = String.copyValueOf(Str1, 2, 6);
        System.out.println(Str2);
    }
}

