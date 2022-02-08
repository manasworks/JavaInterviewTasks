package array;

import java.util.Arrays;

public class Array_FindMaximum {
    public static void main(String[] args) {

        int[] arr = {0,5,6,9,7,2,-5,2,2-99,22,0};
        System.out.println("Maximum integer in array: "+maxArray(arr));

    }

    public static int maxArray(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int each : array) {
            if (max < each) {
                max = each;
            }
        }
        return max;
    }
}
//Write a function that can find the maximum number from an int Array