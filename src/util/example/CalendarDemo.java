package util.example;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        String[] mouth = {
          "Հունվար", "Փետրվար", "Մարտ", "Ապրիլ",
          "Մայիս", "Հունիս", "Հուլիս", "Օգոստոս",
          "Սեպտեմբեր", "Հոկտեմբեր", "Նոյեմբեր", "Դեկտեմբեր"
        };
        Calendar calendar = Calendar.getInstance();
        System.out.print("Ամսաթիվը - " + mouth[calendar.get(Calendar.MONTH)]);
        System.out.print(" " + calendar.get(Calendar.DATE));
        System.out.println(" " + calendar.get(Calendar.YEAR));
        System.out.print("Ժամը - " + calendar.get(Calendar.HOUR) + ":");
        System.out.print(calendar.get(Calendar.MINUTE) + ":");
        System.out.println(calendar.get(Calendar.SECOND));
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 29);
        calendar.set(Calendar.SECOND, 22);
        System.out.println("Փոխված ժամը");
        System.out.print("Ժամը - " + calendar.get(Calendar.HOUR) + ":");
        System.out.print(calendar.get(Calendar.MINUTE) + ":");
        System.out.print(calendar.get(Calendar.SECOND));
    }
}

