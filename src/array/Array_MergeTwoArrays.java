package array;

import java.util.Arrays;

public class Array_MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        int[]arr3= new int [arr1.length+ arr2.length];//we initialize new integer array, with exactly size from 2 arrays
        int i=0;// increment indicator, which help to add elements from arrays
        for (int each1 : arr1) {//for each loop for separating each element from array
            arr3[i++]=each1;// adding separated elements to new array
        }
        for (int each2 : arr2) {
            arr3[i++]=each2;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
// Write a return method that can concat two arrays