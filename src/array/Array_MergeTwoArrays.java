package array;

import java.util.Arrays;

public class Array_MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,9,10};

        System.out.println(Arrays.toString(merge(arr1, arr2)));
        System.out.println(Arrays.toString(merge2(arr1, arr2)));

    }

    public static int[] merge(int[] arr1, int[] arr2){
        /*
        To combine or merge to arrays fist we need create a new array with the length of a sum of arrays that we want to
        combine. Because Arrays are immutable  and can't change it's size. So our first step will be create new Array and
        the length define as first + second arrays length. Then I want to use for each loops and because for each doesn't
        have indexes I need one variable that will track my index numbers.
        I will run first array in for each loop and add each element to a new Array and will increase my Index variable by
        one. Then where ever the first loop is finished I will start second loop for second array and continue assigning
        with index number where my first loop finished. That way I get combined new Array
         */

        int[] result = new int[arr1.length+arr2.length]; // Creating new Array with length of two arrays
        int index=0; // My Variable that will store current index in new array
        for (int each : arr1) { // First Loop for first array assigning value to new array starting with 0 index
            result[index++]=each;
        }
        for (int each : arr2) { // Assigning second array to a new array. My index number becomes the length of first array
            result[index++]=each;
        }
        return result;
    }

    // Second approach with one loop
    public static int[] merge2(int[] arr1, int[] arr2){

        int ar1Len = arr1.length; // Getting length of 1 array
        int ar2Len = arr2.length; // Getting length of 1 array
        int loopMax = Math.max(ar1Len, ar2Len); // Getting length which is bigger

        int[] result = new int[ar1Len+ar2Len]; // New array with length of two arrays

        for (int i = 0; i < loopMax; i++) { // Running my loop according to the biggest array of two
            if (i<ar1Len){ // Making sure that if the second array was longer we won't get out of bond exception
                result[i] = arr1[i]; // Assigning new array
            }
            if (i<ar2Len){ // Making sure that if the first array was longer we won't get out of bond exception
                result[ar1Len+i] = arr2[i]; // Assigning new array
            }
        }
        return result;
    }
}
// Write a return method that can concat two arrays