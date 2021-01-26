package util.example;

import java.util.Formatter;

public class FormatDemo_3 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        fmt.format("Ֆայլի պատճենում%nՓոխանցումը ավարտվել %d%%", 100);
        System.out.println(fmt);
        fmt.close();
    }
}

