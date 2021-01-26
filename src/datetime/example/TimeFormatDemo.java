package datetime.example;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df;
        df = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Ճապոնիա " + df.format(date));
        df = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.CANADA);
        System.out.println("Կանադա " + df.format(date));
        df = DateFormat.getTimeInstance(DateFormat.LONG, Locale.UK);
        System.out.println("Մեծ Բրիտանիա " + df.format(date));
        df = DateFormat.getTimeInstance(DateFormat.FULL, Locale.US);
        System.out.println("ԱՄՆ " + df.format(date));
    }
}

