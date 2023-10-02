package com.ds.features;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DefaultLocale {
    public static void main(String[] args) {
        // Localisation involves ensuring program is adaptable to the location from which is being executed.
        Locale locale = Locale.getDefault(); // language_Country
        System.out.println(locale);

        // Constructor
        Locale locale1 = new Locale("en", "IN");
        System.out.println(locale1.getDisplayLanguage());
        System.out.println(locale1.getDisplayCountry());

        //Built in constants
        Locale locale2 = Locale.ENGLISH;

        double n = 77_000.11;
        System.out.println(NumberFormat.getNumberInstance(Locale.US).format(n));

        double currency = 23.22;
        System.out.println(NumberFormat.getCurrencyInstance(Locale.ITALY).format(currency));

        double custom = 77_100.22;
        System.out.println(new DecimalFormat("₹#,##,###.#").format(custom));

        Locale locUS = Locale.GERMANY;
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(dateTimeFormatter.withLocale(locUS).format(ldt));

    }
}
