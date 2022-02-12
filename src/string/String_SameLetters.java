/*
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:
 */
package string;

import java.util.Arrays;

public class String_SameLetters {
    public static void main(String[] args) {

        String str1="abc";
        String str2="cab";

        System.out.println( hasSameLetters(str1, str2));
    }
    public static boolean hasSameLetters(String str1, String str2){
        /*
        To compara to string if they have same letters we can convert this strings into array
        Either to string array by String[] str1.split(""); method or
        to char array by char[] str1.toCharArray();

        After we created our arrays we can sort them by sort method
        and then compare by Arrays.equals method.

         */
        String[] arr1 = str1.split(""); // Convert to String array
        String[] arr2 = str2.split(""); // Convert to String array
        Arrays.sort(arr1); // Sort the arrays
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2); // Compare if they are equal

    }
}