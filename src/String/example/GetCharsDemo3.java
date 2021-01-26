package String.example;

public class GetCharsDemo3 {
    public static void main(String[] args) {
        StringBuffer bf = new StringBuffer("cd");
        char[] chArr = new char[]{'a','b','r','t','e','f'};
        System.out.println("Մինչև getChars() մեթոդի կիրառելը ");
        for (char ch : chArr){
            System.out.print(ch);
        }
        System.out.println();
        bf.getChars(0, 2, chArr, 2);
        System.out.println("getChars() մեթոդի կիրառելուց հետո ");
        for (char ch : chArr){
            System.out.print(ch);
        }
    }
}

