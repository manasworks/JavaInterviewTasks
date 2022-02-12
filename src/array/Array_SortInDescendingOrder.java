/*
10	Write a return method that can sort an int array in descending order without using the sort method
 */

package array;

import java.util.Arrays;

public class Array_SortInDescendingOrder {
    public static void main(String[] args) {

        int[] arr = {1,4,6,8,10};
        int [] newArray = new int[arr.length];

        for (int i = arr.length - 1,j = 0; i >= 0; j++, i--) {
            newArray[j] = arr[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}

