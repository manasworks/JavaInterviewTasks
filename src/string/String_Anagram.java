/*
Write a  function that check if a string is build out of the same letters as another string.
        Ex: same("abc", "cab"); -> true , Solution 1:
            same("abc", "abb"); -> false:
 */
package string;

import java.util.Arrays;

public class String_Anagram {
    public static void main(String[] args) {
        String s1="abc";
        String s2="cab";

        System.out.println(s1+" "+s2+" is anagram "+isAnagram(s1, s2));
    }
/*
If string has same amount and type chars than we can say that it's an Anagram. To check if string anagram
we will convert our string to char array. sort it and then compare.
 */
    public static boolean isAnagram(String s1, String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] ar1 = s1.toCharArray();
        char[] ar2 = s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        return Arrays.equals(ar1, ar2);
    }
}