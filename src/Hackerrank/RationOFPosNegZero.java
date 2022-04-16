package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;


public class RationOFPosNegZero {
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float ratio1=0, ratio2=0, ratio3=0, n=arr.size();
        DecimalFormat df = new DecimalFormat("0.000000");
        for (Integer each : arr) {
            if (each>0) ratio1++;
            else if (each<0) ratio2++;
            else ratio3++;
        }
        System.out.println(df.format((ratio1/n) ));
        System.out.println(df.format(ratio2/n));
        System.out.println(df.format(ratio3/n));
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        plusMinus(arr);
        bufferedReader.close();
    }
}
/*
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
Print the decimal value of each fraction on a new line with 6 places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places,
though answers with absolute error of up to 10-4 are acceptable.

Sample Input
STDIN           Function
-----           --------
6               arr[] size n = 6
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]

Sample Output
0.500000
0.333333
0.166667
 */