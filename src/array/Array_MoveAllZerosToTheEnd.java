package array;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {

    public static int[] moveZeroesToEnd(int[] arr) {

        int[] rev = new int[arr.length];
        int j = 0;
        for (int each : arr) {
            if (each != 0) {
                rev[j++] = each;
            }
        }
        return rev;
    }

    public static void main(String[] args) {
        int[] arr = {0, 5, 6, 9, 7, 2, -5, 0, 0, 2, -99, 22, 0};
        System.out.println(Arrays.toString(moveZeroesToEnd(arr)));

    }

}
// write a program that can move all the zeros to the end of an array