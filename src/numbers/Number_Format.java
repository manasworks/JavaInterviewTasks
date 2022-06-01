package numbers;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Number_Format {
    public static void main(String[] args) {
        double d = 100000.00;
        System.out.println("$"+new DecimalFormat("#,###.00").format(d));


        String s = NumberFormat.getNumberInstance().format(d);
        System.out.println("s = " + s);

    }
}
