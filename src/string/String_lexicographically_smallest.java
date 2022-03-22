/*
The numeric value of a lowercase character is defined as its position (1-indexed) in the alphabet,
so the numeric value of a is 1, the numeric value of b is 2, the numeric value of c is 3, and so on.

The numeric value of a string consisting of lowercase characters is defined as the sum of its characters'
numeric values. For example, the numeric value of the string "abe" is equal to 1 + 2 + 5 = 8.

You are given two integers n and k. Return the lexicographically smallest string with length equal
to n and numeric value equal to k.

Note that a string x is lexicographically smaller than string  y  if x comes before y in dictionary order,
that is, either x is a prefix of y, or if i is the first position such that x[i] != y[i], then x[i] comes before y[i] in alphabetic order.

 */
package string;

import java.util.Arrays;

public class String_lexicographically_smallest {
    public static void main(String[] args) {

        System.out.println(lexicographicallySmallest(9, 9));

    }

    public static String lexicographicallySmallest(int length, int sum){
        String result="";
        if (length>sum) return "Invalid input";
        if (sum==1) return "a";

        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) arr[i]=1;

        for (int i = arr.length-1; i >=0 ; i--) {
            for (int j = 0; j <= 26 ; j++) {
                arr[i]=j;
                int sumOfDigits=0;
                for (int each : arr) sumOfDigits+=each;
                if (sumOfDigits==sum) {
                    break;
                }
            }
        }

        for (int each : arr) {
            char c = (char)(each+96);
            result += ""+c;
        }

        return result;
    }

}