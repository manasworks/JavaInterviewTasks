package array;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {

    public static void main(String[] args) {

        int[] arr = {0, 0, 5, 6, 9, 7, 2, 22, 0};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(moveToRight(arr, 0)));
        //System.out.println(Arrays.toString(moveToLeft(arr, 0)));

    }

    public static int[] moveToRight(int[] arr, int numToMove) {
        /*
        To move all zeroes or any other value to the right I will create a new array and run for loop to check
        each element and if it's equal to given value I will add it to my new array to end and if not
        will add it to the start. Therefore, we will need extra variables to count starting and ending indexes
        will move to right
         */
        int[] result = new int[arr.length]; // My new array with same length

        for (int i = 0, j = 0, z = arr.length - 1; i < arr.length; i++) {
            // i > is for iterating original array, j > for iterating from start and z > to iterate from the end
            if (arr[i] == numToMove) { // If current number from array equals to given num
                result[z--] = arr[i]; // I will put it in the back of my new array and do -1 for next
            } else { // If not equal
                result[j++] = arr[i]; // I will put it to the star of my array and do +1 for next
            }
        }
        return result;
    }


}
// write a program that can move all the zeros to the end of an array