package array;

import java.util.Arrays;

public class Array_SortInAscendingOrder {

    public static void main(String[] args) {

        int [] arr = {1,4,7,3,9,-4,-2,8,0};
        //Arrays.sort(arr);
        System.out.println(Arrays.toString(sortAscending(arr)));

    }

    public static int[] sortAscending(int[] arr){


        for (int i = 0; i < arr.length-1; i++) {
            int temp = 0;
            for (int k = i + 1; k < arr.length - 1; k++) {
                if (arr[i] > arr[k]) {
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        return arr;

    }
}
