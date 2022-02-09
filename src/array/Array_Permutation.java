package array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Array_Permutation {

    public static void main(String[] args) {

        char[] arr = {'A', 'B', 'C'};
        giveAllCombinations(arr);
        permutation(arr);

    }

    public static void giveAllCombinations(char[] arr){
        /*
        To get all possible combination from array we need to create nested loops and how many nested loops we need is
        depends on the number of values in array, or we can say the length of array. In our case we have 3 characters
        that's why we will need 3 nested loops. And to avoid value duplicated and hold permutation we will check if in
        sub nest value is not equal to upper

        Note: This is kind a hard code solution. Will work only if there is 3 elements...
         */

        for (char each : arr) {
            for (char sub : arr) {
                if(each==sub) continue;
                for (char last : arr) {
                    if(sub==last || each==last) continue;
                    System.out.println("["+each+", "+sub+", "+last+"]");
                }
            }
        }
    }

    public static void permutation(char[] arr){
        // 2 = 1*2
        // 3 = 1*2*3
        // 4 = 1*2*3*4
        // Elements and permutations possibilities. So basically we need factorial of number of elements

        int factorial = 1;
        for (int i = 1; i <= arr.length; i++) {
            factorial=factorial*i;
        }
        System.out.println(factorial);

    }

}
// Given an array of 3 characters print all permutation combinations from the given characters