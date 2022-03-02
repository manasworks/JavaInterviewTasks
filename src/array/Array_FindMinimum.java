package array;

import java.util.Arrays;

public class Array_FindMinimum {
    public static void main(String[] args) {

        int[] arr = {0,5,6,9,7,2,-5,2,2,-99,22,0};

        System.out.println(findMin(arr));
        System.out.println(findMin2(arr));

    }

    public static int findMin(int[] arr){
        // To find minimum number from an Array. Firstly we need a new Variable to store our Min
        // Than we will just check each number if it's smaller than our Min by using For Each Loop
        // And if its smaller than we will just reassign our Min with current Each / number

        int min = arr[0]; // Creating my Min Variable and initiating it by giving first number from array.

        for (int each : arr) { // Starting my for Each loop where each will be all numbers from array one by one
            if (each<min) { // My condition if current num from array is smaller than my Min
                min=each; // If yes than i reassigning my Min with current number
            }
        }
        return min;
    }

    //Solving with sort method
    public static int findMin2(int[] arr){

        Arrays.sort(arr); // sorting the array
        return arr[0]; // returning first element from array

    }
}
// Write a function that can find the minimum number from an int Array