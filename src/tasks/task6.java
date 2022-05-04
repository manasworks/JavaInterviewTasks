package tasks;

import java.util.Arrays;
import java.util.Collections;

public class task6 {
    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };

        System.out.println( secondLargestNumber2(arr) );

        System.out.println( secondMax(arr) );
    }

    static int secondMax(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    public static int secondLargestNumber2(int[] arr) {
        int max1 = arr[0];
        int max2 = arr[0];
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return max2;
    }
}
