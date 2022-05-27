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

    /*
    First we need to split the string by part of letters and numbers. Then we will take each part and sort it.
    To sort I will use arrays sort method. To do so will convert my part to array sort it and then concate it back
    to my result string
     */

    public static String sort(String str){

        StringBuilder result= new StringBuilder(); // To save my result

        for (int i = 0; i < str.length(); i++) { // First main loop to iterate each char

            StringBuilder temp= new StringBuilder(); // Temp String to save my part of a String

            if (Character.isLetter(str.charAt(i))){ // Will check if current char is Letter.
                while (i<str.length() && Character.isLetter(str.charAt(i))){ // Will start my while loop till my char is still a letter
                    temp.append(str.charAt(i++)); // Adding my letter to temp
                }
                char[] chars = temp.toString().toCharArray(); // Converting my temp result to a char array
                Arrays.sort(chars); // Sorting my char array
                result.append(new String(chars)); // Putting sorted temp to my result
                i--; // Making my i minus one to prevent jumping over.
            } else { // If current char not a letter do same
                while (i<str.length() && Character.isDigit(str.charAt(i))){
                    temp.append(str.charAt(i++));
                }
                char[] chars = temp.toString().toCharArray();
                Arrays.sort(chars);
                result.append(new String(chars));
                i--;
            }
        }
        return result.toString(); // return my result
    }
}
