package currency;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("LAN HAYATA BOYLE BIR PARA GORDUN MU ;SDFASFKDSLFLDLFD");
        Locale locale=new Locale("tr","TR");
        Currency currency=Currency.getInstance(locale);

        NumberFormat currencyNumber = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currency.getDisplayName());
        System.out.println(locale.getDisplayName());

        System.out.println(currencyNumber.format(1230987449999995.33));

        System.out.println("\n");

        Locale locale1=new Locale("en","GH");
        Currency currency1=Currency.getInstance(locale1);

        NumberFormat currencyNumber1 = NumberFormat.getCurrencyInstance(locale1);
        System.out.println(currency1.getDisplayName());
        System.out.println(locale1.getDisplayName());

        System.out.println(currencyNumber1.format(1230987449999995.33));

    }
}
