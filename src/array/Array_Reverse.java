package array;

import java.util.Arrays;

public class Array_Reverse {

    public static void main(String[] args) {

        char[] arr = {'A', 'B', 'C', 'D', 'E'};

        System.out.println("Current array: "+ Arrays.toString(arr));
        System.out.println("Reversed array: "+Arrays.toString(reverseArray(arr)));
    }

    public static char [] reverseArray(char [] array){
        char [] reversedArray = new char[array.length];
        int j=0;
        for (int i = array.length-1; i >=0; i--) {
            reversedArray[j++]=array[i];
        }
        return reversedArray;
    }
}
// write a function that can reverse an array