package array;

import java.util.Arrays;

public class Array_SortInDescendingOrder {
    public static void main(String[] args) {

        int[] arr = {2,1,1,1,0,1,3,9,8,5,6,10,22};

        System.out.println(Arrays.toString( arr));
        System.out.println(Arrays.toString( sortDescending(arr)));

    }

    public static int[] sortDescending(int[] arr){
        /*
        To sort array we will need nested loops. First loop take value and run down it in inner loop to check if its
        smaller than next ones. If it is smaller we will store it to temp variable and re-assign to it's place a new value
        that is bigger that way bigger values will move to the left. Then we will put temp value installed of what we
        moved.
        Why we started inner loop from i+1. This because we always want to check next number in array.
         */
        for (int i = 0; i < arr.length; i++) { // First loop

            for (int j = i+1; j < arr.length; j++) { // Inner loop to check value from first with the rest
                if (arr[i] > arr[j]) { // Check if my number from outer loop is smaller than next from inner
                    int temp = arr[i]; // If yes assign that number to temp
                    arr[i] = arr[j]; // If yes my left num becomes bigger number from the right
                    arr[j] = temp; // If yes my right num becomes what we stored
                }
            }

        }

        return arr;
    }
}
