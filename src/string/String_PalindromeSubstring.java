package string;

import java.util.*;

public class String_PalindromeSubstring {
    public static void main(String[] args) {

        String[] str = {"levvel", "rdacecar", "letter", "levtrel", "anncda", "ancdefgg", "hellosannasmith"};

        for (String each : str) {
            System.out.println(each + "-: " + PalindromeSubstring(each));
            System.out.println(each + "+: " +  longestPalindrome(each));
        }
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
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static String longestPalindrome(String str) {
        String result = "";
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                s = str.substring(i, j);
                if (isPalindrome(s)) if (s.length() > result.length()) result = s;
            }
        }
        if (result.length() <= 2) return "none";
        return result;
    }

}
