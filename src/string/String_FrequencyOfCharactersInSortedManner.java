/*
Return the frequency of each character in the given string in Sorted manner
    Ex:
        Input: DDDAACCCCCCB
        Output: A2B1C6D3
 */
package string;

import java.util.Arrays;

public class String_FrequencyOfCharactersInSortedManner {
    public static void main(String[] args) {
        String str="DDDAACCCCCCB";
        System.out.println( frequencySorted(str) );
    }
/*
To get frequency of char in sorted manner firstly we need to sort our String. To do so will use array sort method.
Converting string to char array, sort it and convert it back to String. With sorted String will use regular frequency
counter loops.
 */
    public static String frequencySorted(String str){
        String result="";

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);

        for (int i = 0; i < sorted.length(); i++) {
            int count=0;
            for (int j = 0; j < sorted.length(); j++) {
                if (sorted.charAt(i)==sorted.charAt(j)) count++;
            }
            if (!result.contains(""+sorted.charAt(i))) result+=""+sorted.charAt(i)+count;
        }
        return result;
    }
}