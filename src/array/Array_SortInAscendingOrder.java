package array;

import java.util.Arrays;

public class Array_SortInAscendingOrder {

    public static void main(String[] args) {

        int[] arr = {2,1,1,1,0,1,3,9,8,5,6,10,22};

        System.out.println(Arrays.toString( arr));
        System.out.println(Arrays.toString( sortAscending(arr)));

    }

    public static int[] sortAscending(int[] arr){
        /*
        To sort array we will need nested loops. First loop take value and run down it in inner loop to check if its
        bigger than next ones. If it is bigger we will store it to temp variable and re-assign to it's place a new value
        that is smaller that way smaller values will move to the left. Then we will put temp value installed of what we
        moved.
        Why we started inner loop from i+1. This because we always want to check next number in array.
         */
        for (int i = 0; i < arr.length; i++) { // First loop

            for (int j = i+1; j < arr.length; j++) { // Inner loop to check value from first with the rest
                int temp=0; // Temp variable to store if number from first loop bigger than next number from inner loop
                if (arr[i] > arr[j]) { // Check if my number from outer loop is bigger than next from inner
                    temp = arr[i]; // If yes assign that number to temp
                    arr[i] = arr[j]; // If yes my left num becomes smaller number from the right
                    arr[j] = temp; // If yes my right num becomes what we stored
                }
            }

        }

        return arr;
    }
}
// Write a method that can sort an int array in Ascending order without using the sort method