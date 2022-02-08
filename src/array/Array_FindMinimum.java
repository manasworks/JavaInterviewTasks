package array;

import java.util.Arrays;

public class Array_FindMinimum {
    public static void main(String[] args) {

        int[] arr = {0,5,6,9,7,2,-5,2,2-99,22,0};
        System.out.println("Minimum integer in array is: "+minArray(arr));
    }

    public static int minArray(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int each : array) {
            if (min > each) {
                min = each;
            }
        }
        return min;
    }
}

// Write a function that can find the minimum number from an int Array