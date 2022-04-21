package array;

import java.util.Arrays;

public class Array_Shift_Times {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        //System.out.println(Arrays.toString(shiftArray(arr, 9)) );
        System.out.println(Arrays.toString(shiftArray2(arr, 2)) );

    }
    static int[] shiftArray(int[] arr, int times){

        int temp=0;
        for (int i = 0; i < times; i++) {
            temp=arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j-1]=arr[j];
            }
            arr[arr.length-1]=temp;
        }
        return arr;
    }

    static int[] shiftArray2(int[] arr, int times){

        int len= arr.length;

        if (len<=1) return arr;

        int shift = times%len;
        if (shift==0) return arr;

        int[] result=new int[len];

        for (int i = 0; i < result.length; i++, shift++) {
            if(shift<len)result[i] = arr[shift];
            else result[i]=arr[shift-len];
        }

        return result;
    }
}
