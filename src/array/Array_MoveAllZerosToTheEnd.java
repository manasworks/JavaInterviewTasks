package array;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {

    public static void main(String[] args) {

        int[] arr = {0,5,6,9,7,2,-5,0,0,2,2-99,22,0};
        int [] arr2=new int [arr.length];//creat new integer array with the same size
        int count=0;//counting total elements form Array
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0) {//if element not equal 0, we need to add them to new array
                arr2[count] = arr[i];//new array will consist all elements from old array, except zeros
                count++;// but because we were creating new array with the same size, left empty indexes will come 0 by default
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
// write a program that can move all the zeros to the end of an array