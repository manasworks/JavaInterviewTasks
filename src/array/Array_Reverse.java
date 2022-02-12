package array;

import java.util.Arrays;

public class Array_Reverse {

    public static void main(String[] args) {

        char[] arr = {'A', 'B', 'C', 'D', 'E'};
        char [] newArray = new char[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            newArray [j] = arr[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
// write a function that can reverse an array