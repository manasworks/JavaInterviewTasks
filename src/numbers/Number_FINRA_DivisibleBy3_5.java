package numbers;

public class Number_FINRA_DivisibleBy3_5 {
    public static void main(String[] args) {
        // FinRA by 2 if statements
        for (int i = 1; i <=100 ; i++) {
            String result = "";
            if (i%3==0) result = "Fin";
            if (i%5==0) result += "RA";
            System.out.println(result);
        }
    }
}
