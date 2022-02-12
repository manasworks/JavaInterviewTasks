package array;

import java.util.Arrays;

public class Array_MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        int[] result = new int[arr1.length + arr2.length]; //creating a third array where we will merge both arrays
        int  i = 0; // creating a variable for iteration
        for (int each : arr1) {  // for each loop to get each element of the first array and save them in a new array
            result[i++] = each;
        }
        for (int each : arr2) { //for each loop to get each element of the second array and merge them into a new array Result
            result[i++] =each;
        }

        System.out.println(Arrays.toString(result));

    }
}
// Write a return method that can concat two arrays