package regex.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;
        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        // ստուգում է համընկնումը
        found = mat.matches();
        System.out.println("Ստուգում է համընկնումը Java-ն Java-ի հետ");
        if (found){
            System.out.println("Համընկնում է");
        }else{
            System.out.println("Չի համընկնում");
        }
        System.out.println();
        System.out.println("Ստուգում է համընկնումը Java-ն Java 9-ի հետ");
        mat = pat.matcher("Java 9");
        // ստուգում է համընկնումը
        found = mat.matches();
        if (found){
            System.out.println("Համընկնում է");
        }else{
            System.out.println("Չի համընկնում");
        }
    }
}

