package array;

import java.util.Arrays;

public class Array_RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        int newArr []= new int [arr.length];
        int j=0;
        int count=0;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                count++;
                newArr[j++]=arr[i];
            }
        }
        newArr[j++]=arr[arr.length-1];


        System.out.println(Arrays.toString(newArr));



    }
}
// Write a function that can remove the duplicates from an array of integers