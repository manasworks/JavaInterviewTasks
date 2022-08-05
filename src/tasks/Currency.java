package tasks;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Currency {
    public static void main(String[] args) {
        String value = "-314159.2653";

        BigDecimal money = new BigDecimal(value);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat format = new DecimalFormat("$###,###.00");
        format.setDecimalFormatSymbols(symbols);
        System.out.println(format.format(money));
    }
}
