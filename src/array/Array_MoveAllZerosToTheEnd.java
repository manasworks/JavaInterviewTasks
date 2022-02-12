package array;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {

    public static void main(String[] args) {

        int[] arr = {0,5,6,9,7,2,-5,0,0,2,2-99,22,0};

        int[] newArray = new int[arr.length];
        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                newArray[count]=arr[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(newArray));

    }
}
// write a program that can move all the zeros to the end of an array