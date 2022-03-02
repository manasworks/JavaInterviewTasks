package array;

import java.util.Arrays;

public class Array_FindMaximum {
    public static void main(String[] args) {

        int[] arr = {0,5,6,9,7,2,-5,2,2-99,22,0};

        System.out.println(findMax(arr));
        System.out.println(findMax2(arr));
    }

    public static int findMax(int[] arr){
        // To find maximum from an array firstly we need one extra Variable to store the max number
        // Than we will just run For Each Loop to check each element if it's bigger than our max value.
        // And if it's Bigger than we will just reassign our Max with current each value.

        int max = arr[0]; // our Variable that will hold max value. Assigning it with first number in Array. Anyway it will change will bigger number appears

        for (int each : arr) { // Starting my for each loop
            if (each>max){ // Condition if current number is bigger than Max
                max = each; // If yes assigning new number as Max
            }
        }
        return max;
    }

    // By sort method
    public static int findMax2(int[] arr){

        Arrays.sort(arr); // Sorting the array by sort method
        return arr[arr.length-1]; // returning the last element in sorted array

    }
}
//Write a function that can find the maximum number from an int Array