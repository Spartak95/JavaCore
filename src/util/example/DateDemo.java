package util.example;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date dt1 = new Date(2019, 3, 31);
        Date dt2 = new Date(2019, 5, 14);
        Date dt3 = new Date();
        System.out.println("dt1.after(dt2) " + dt1.after(dt2));
        System.out.println("dt1.before(dt2) " + dt1.before(dt2));
        System.out.println("Միլիվայրկյանի այն քանակը, որը հաշվված " +
                "է 1970 թ-ի հունվարի 1-ից սկսած " + dt1.getTime());
        dt3.setTime(255000);
        System.out.println("dt3 " + dt3);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);
        System.out.println("20 days later: " + cal.getTime());
        cal.add(Calendar.DATE, 3);
        System.out.println("20 days later: " + cal.getTime());
    }
}

