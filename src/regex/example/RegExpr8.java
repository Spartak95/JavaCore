package regex.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr8 {
    public static void main(String[] args) {
        String str = "Jon Jonathan Frank Ken Todd";
        Pattern pat = Pattern.compile("Jon.*?");
        Matcher mat = pat.matcher(str);
        System.out.println("Ելակետային հաջորդականությունը " + str);
        str = mat.replaceAll("Eric ");
        System.out.println("Փոփոխված հաջորդականությունը " + str);
    }
}

