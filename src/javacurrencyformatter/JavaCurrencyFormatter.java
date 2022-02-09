package javacurrencyformatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        /* Read input */
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        /* Create custom Locale for India.
         I used the "IANA Language Subtag Registry" to find India's country code */

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat numberFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormatIndia = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat numberFormatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat numberFormatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: "+numberFormatUS.format(payment));
        System.out.println("India: "+numberFormatIndia.format(payment));
        System.out.println("China: "+numberFormatChina.format(payment));
        System.out.println("France: "+numberFormatFrance.format(payment));

    }
}
