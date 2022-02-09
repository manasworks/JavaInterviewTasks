package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_FirstUniqueElement {
    public static void main(String[] args) {

        int[] arr = {1,5,6,9,7,88,2,-5,2,2,-99,22,0};

        System.out.println(findFirstUnique(arr));
    }

    public static int findFirstUnique(int[] arr){

        /* To find first duplicate from an array we need two loops. First loop will take one number and
        the second will run through all the array to find if there is any matches and count up. If at end of inner loop
        if my matches equals to 1 than that means that element is unique in the array and I can return it as my result.
         */

        for (int each : arr) { // Starting my outer loop which will take one number by order
            int count=0; // My counter for each number
            for (int sub : arr) { // Inner loop to see compare taken number in outer loop with all elements in array
                if (each==sub) count++; // If there is a match make my counter +1
            }
            if (count==1) return each; // After checking all elements in inner loop if count equals to 1 that means my element is unique
        }
        return -1; // For the case if there is no unique elements my return -1
    }
}
//Q3 write a program that can find the first duplicated element from the array