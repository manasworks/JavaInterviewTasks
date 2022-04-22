package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrays_ChargeForCake {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(Arrays.asList(3, 2, 1, 3));

        System.out.println(birthdayCakeCandles(arr));

    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here

        int max = Collections.max(candles);
        return Collections.frequency(candles, max);

    }
}
