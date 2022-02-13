package array;

import java.util.Arrays;

public class Array_Reverse {

    public static void main(String[] args) {

        char[] arr = {'A', 'B', 'C', 'D', 'E'};

        char [] reverseArr = new char[arr.length];//created new reverse arr, for putting same elements from old arr

        int j=0;//that indicator we need for increment  element from old arr in new arr

        for (int i = arr.length-1; i >=0; i--) {// start from last element, and loop will stop when match index 0
            reverseArr[j++]=arr[i];
        }
        System.out.println(Arrays.toString(reverseArr));
    }
}
// write a function that can reverse an array