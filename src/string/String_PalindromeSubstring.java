package string;

import java.util.*;

public class String_PalindromeSubstring {
    public static void main(String[] args) {
        String s1 = "hellosannasmith";
        String s2 = "ancdefgg";

        System.out.println("Longest palindrome: " + PalindromeSubstring(s1));
        System.out.println("Longest palindrome: " + PalindromeSubstring(s2));
    }

    public static String PalindromeSubstring(String str) {

        String result = "";
        int max = 0;
        for (int i = 1; i < str.length(); i++) {
            int j = i, l = i;
            while (--j >= 0 && ++l <= str.length() - 1) {
                if (isPalindrome(str.substring(j, l))) {
                    int length = str.substring(j, l).length();
                    if (length > max) {
                        max = length;
                        result = str.substring(j, l);
                    }
                }
            }
        }
        return (result.isEmpty()) ? "none" : result;
    }

    public static boolean isPalindrome(String s) {
        StringBuilder reverse = new StringBuilder(s);
        reverse.reverse();
        return s.equals(reverse.toString());
    }


}
