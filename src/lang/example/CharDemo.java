package lang.example;

public class CharDemo {
    public static void main(String[] args) {
        char[] a = {'a', 'b', '5', '?', 'A', ' '};
        for (int i=0; i<a.length; i++){
            if (Character.isDigit(a[i])){
                System.out.println(a[i] + " - թիվ" );
            }if (Character.isLetter(a[i])){
                System.out.println(a[i] + " - տառ");
            }if (Character.isWhitespace(a[i])){
                System.out.println(a[i] + " - պրոբելային սիմվոլ");
            }if (Character.isUpperCase(a[i])){
                System.out.println(a[i] + " - մեծատառ");
            }if (Character.isLowerCase(a[i])){
                System.out.println(a[i] + " - փոքրատառ");
            }
        }
    }
}

