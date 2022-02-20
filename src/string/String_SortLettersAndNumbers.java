/*
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
sort the individual string and append them back together
    Ex:
        Input: "DC501GCCCA098911"
        Output: "CD015ACCCG011899"
 */
package string;

import java.util.Arrays;

public class String_SortLettersAndNumbers {
    public static void main(String[] args) {
        String str = "DC501GCCCA098911";
        System.out.println(str);
        System.out.println( sort(str) );
    }

    public static String sort(String str){

        String result="";

        for (int i = 0; i < str.length(); i++) {

            String temp="";
            if (Character.isLetter(str.charAt(i))){
                while (i<str.length() && Character.isLetter(str.charAt(i))){
                    temp+=str.charAt(i++);
                }
                char[] chars = temp.toCharArray();
                Arrays.sort(chars);
                result += new String(chars);
                i--;
            } else {
                while (i<str.length() && Character.isDigit(str.charAt(i))){
                    temp+=str.charAt(i++);
                }
                char[] chars = temp.toCharArray();
                Arrays.sort(chars);
                result += new String(chars);
                i--;
            }
        }
        return result;
    }
}
