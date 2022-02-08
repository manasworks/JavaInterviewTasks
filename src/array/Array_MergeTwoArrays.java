package array;

import java.util.Arrays;

public class Array_MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        int [] mergedArray = mergedArray(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));
    }
    
    public static int [] mergedArray(int [] arr1, int [] arr2){
        int [] mergedArray = new int[arr1.length+arr2.length];
        int j=0;
        for (int each : arr1) {
            mergedArray[j++]=each;
        }
        for (int each : arr2) {
            mergedArray[j++]=each;
        }
        return mergedArray;

        }
    }

// Write a return method that can concat two arrays