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

public class String_LongestPalindrome {
    public static void main(String[] args) {
        String str="babad";
        System.out.println("Longest palindrome from: \""+str+"\" is: \""+ longestPalindrome(str)+"\"" );
    }

    public static String longestPalindrome(String str){
        str = str+" ";
        String result="";
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                String current = str.substring(i, j);

                if (current.length()>1 && current.equals( reverse(current))){
                    if (current.length() > result.length()){
                        result = current;
                    }
                }
            }
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
