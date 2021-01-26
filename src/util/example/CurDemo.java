package util.example;

import java.util.Currency;
import java.util.Locale;

public class CurDemo {
    public static void main(String[] args) {
        Currency c = Currency.getInstance(Locale.US);
        Currency c2 = Currency.getInstance(Locale.UK);
        System.out.println("Սիմվոլը " + c.getSymbol());
        System.out.println("Սիմվոլը " + c2.getSymbol());
        System.out.println("Թվի կոտորակային մասում թվերի քանակը լռելությամբ "
                + c.getDefaultFractionDigits());
        System.out.println("Թվի կոտորակային մասում թվերի քանակը լռելությամբ "
                + c2.getDefaultFractionDigits());
    }
}

