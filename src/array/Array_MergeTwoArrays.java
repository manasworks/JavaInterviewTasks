package array;

import java.util.Arrays;

public class Array_MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] newArray = new int[arr1.length + arr2.length];


        int i = 0;
        for (int each : arr1) { //1,2,3,4,5
            newArray[i++] = each;
        }


        for (int each : arr2) {
            newArray[i++] = each;
        }

        System.out.println(Arrays.toString(newArray));
    }
}

// Write a return method that can concat two arrays