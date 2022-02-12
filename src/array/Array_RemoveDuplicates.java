package array;

import java.util.Arrays;

public class Array_RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        int j=0;
        int count=1;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
        int newArr []= new int [count];
        for (int i = 0; i < arr.length-1; i++) {
           if(arr[i]!=arr[i+1])
            newArr[j++]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));








    }
}
// Write a function that can remove the duplicates from an array of integers