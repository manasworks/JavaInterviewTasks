package numbers;

import javax.management.StringValueExp;

public class Number_FINRA_DivisibleBy3_5 {
    public static void main(String[] args) {

        finra1to30();
    }

    private static void finra1to30() {
        for (int i = 1; i <= 30; i++) {
            String result =(i%3==0 && i%5==0)? "FINRA" :(i%3==0)? "FIN" :(i%5==0)? "RA" : String.valueOf(i);
            System.out.print(result+" ");

        }
    }
}
