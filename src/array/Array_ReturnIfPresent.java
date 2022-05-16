package array;

import java.util.Arrays;
import java.util.List;

public class Array_ReturnIfPresent {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9,9};
        int n = 9;

        System.out.println(solution(arr, n));
    }

    public static int solution(int[]arr, int n){
        int r = Arrays.binarySearch(arr, n);
        return (r==-6)?-1:r;
    }
}
