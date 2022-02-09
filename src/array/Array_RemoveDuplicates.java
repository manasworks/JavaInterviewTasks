package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5,6,6,9,9,100};

        System.out.println( Arrays.toString( removeDuplicates(arr) ) );
        System.out.println( Arrays.toString( removeDuplicates2(arr) ) );
        System.out.println( Arrays.toString( removeDuplicates3(arr) ) );

    }

    public static int[] removeDuplicates(int[] arr){

        /*
        To remove duplicates from array firstly we need a new array. Because array is immutable and we can not modify
        our existing array. However, to create a new array we need to know the length of array if we remove duplicates.
        For this we will run first loop and count total numbers of elements which are not equal to next element, that
        will provide us a number total number of elements without duplication.

        Then we will create our new Array with the length if there were no duplicates. Create one int Variable to count
        our new indexes. And start new loop again. In this loop we check original array again for same if current value is
        not equal to next value. If yes it means that is not duplicated and can add it to our new array. To prevent out of
        bound exception we will our loop to length-1 of array. Because we have check next in our condition.

        And last we have last element not assigned, so we will just assign it and new array is done
         */

        int newArrayLength = 1; // To count new None Duplicated array length. Start from 1 couse array min length is 1

        for (int i = 0; i < arr.length-1; i++) { // My first loop to count the length of array
            if (arr[i]!=arr[i+1]) newArrayLength++; // If number and next number not equal it means none duplicated, and we can count
        }

        int[] result = new int[newArrayLength]; // Creating new array with new no duplicates length
        int index=0; // My new index to count for new array

        for (int i = 0; i < arr.length-1; i++) { // Loop for assign values to my new array
            if (arr[i]!=arr[i+1]) { // Same if current number not equal to next. Means not duplicated
                result[index++]=arr[i]; // If yes add to my new array
            }
        }

        result[index] = arr[arr.length-1]; // Adding last element from original array. Because my loops did not include it

        return result;
    }

    public static int[] removeDuplicates2(int[] arr){
        // Second approach using string

        String temp="";

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]!=arr[i+1]){
                temp+=arr[i]+",";
            }
        }
        temp+=arr[arr.length-1];
        String[] temp2 = temp.split(",");
        int[] result = new int[temp2.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(temp2[i]);
        }

        return result;
    }

    public static int[] removeDuplicates3(int[] arr){
        // With Array list
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]!=arr[i+1]) list.add(arr[i]);
        }
        list.add(arr[arr.length-1]);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) result[i] = list.get(i);
        return result;
    }
}
// Write a function that can remove the duplicates from an array of integers