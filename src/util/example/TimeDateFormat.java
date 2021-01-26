package util.example;

import java.util.Calendar;
import java.util.Formatter;

public class TimeDateFormat {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        // դուրս է բերում ժամանակը 12-ժամյա ֆորմատով
        fmt.format("%tr", cal);
        System.out.println(fmt);
        // դուրս է բերում ամսաթվի և ժամանակի մասին բոլոր տեղեկությունները
        fmt = new Formatter();
        fmt.format("%tc", cal);
        System.out.println(fmt);
        // դուրս է բերում միայն ժամը և րոպեն
        fmt = new Formatter();
        fmt.format("%tl:%tM", cal, cal);
        System.out.println(fmt);
        // դուրս է բերում ամսվա անվանումը և համարը
        fmt = new Formatter();
        fmt.format("%tB %tb %tm", cal, cal, cal);
        System.out.println(fmt);
        fmt.close();
    }
}

