package regex.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr2 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java 9");
        System.out.println("Java 9-ի մեջ Java-ի որոնում");
        if (mat.find()){
            System.out.println("Ենթահաջորդականությունը հայտնաբերվել է");
        }else {
            System.out.println("Համընկնումը բացակայում է");
        }
    }
}

