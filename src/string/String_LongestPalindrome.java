/*
Given a string s, return the longest palindromic substring in s.
Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"
 */
package string;

import java.util.ArrayList;

public class String_LongestPalindrome {
    public static void main(String[] args) {
        String str="testmanassanamtest";
        System.out.println("Longest palindrome from: \""+str+"\" is: \""+ longestPalindrome(str)+"\"" );
    }

    public static String longestPalindrome(String str){
        str = str+" ";
        String result="";
        ArrayList <String> allPossibilities = new ArrayList<>();
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i; j < str.length(); j++) {
                String current = str.substring(i, j);
                if (!current.isEmpty() && !allPossibilities.contains(current)){
                    allPossibilities.add( current );
                }
            }
        }

        for (String each : allPossibilities) {
            if (each.equals( reverse(each))){
                if (each.length() > result.length()){
                    result = each;
                }
            }
        }
        if (result.length()==1) {
            result = "No palindrome is present";
        }
        return result;
    }

    public static String reverse(String str){
        String reversed="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }
        return reversed;
    }
}
