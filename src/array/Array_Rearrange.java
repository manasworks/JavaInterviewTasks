package array;

import java.util.Arrays;

public class Array_Rearrange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString( rearrange(arr) ));
    }

    public static int[] rearrange(int[] arr){
        int[] result = new int[arr.length];
        int j=0;
        for (int i = 2; i < arr.length; i++) {
            result[j++] = arr[i];
        }
        for (int i = 0; i < 2; i++) {
            result[j++] = arr[i];
        }
        return result;
    }
}
