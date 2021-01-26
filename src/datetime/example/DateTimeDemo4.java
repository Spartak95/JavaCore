package datetime.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo4 {
    public static void main(String[] args) {
        LocalDateTime curDateTime = LocalDateTime.
                parse("April 17, 2020 5:57 AM",
                        DateTimeFormatter.ofPattern("MMMM d',' yyyy hh':'mm a"));
        System.out.println(curDateTime.format(DateTimeFormatter.ofPattern("MMMM d','yyyy h':'mm a")));
    }
}

