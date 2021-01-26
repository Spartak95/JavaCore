package util.example;

import java.util.Formatter;

public class FormatDemo_7 {
    public static void main(String[] args) {
        try(Formatter fmt = new Formatter()){
            fmt.format("Ֆորմատավորել %s շատ հասարակ է %d %f", "Java-ի միջոցներով", 10, 98.6);
            System.out.println(fmt);
        }
    }
}

