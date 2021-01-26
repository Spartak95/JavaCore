package regex.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {
        String content =    "begin here to start, and go there to end\n" +
                "come here to begin, and end there to finish\n" +
                "begin here to start, and go there to end";
        String regex    =   "^begin";
        Pattern pattern =   Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher =   pattern.matcher(content);
        while (matcher.find())
        {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }
    }
}
