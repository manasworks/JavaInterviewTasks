/*
Write function that can find the frequency of characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
package string;

public class String_FrequencyOfCharacters {
    public static void main(String[] args) {

        String str="AAABBCDD";

        System.out.println( frequencyOfChars(str) );
    }

    public static String frequencyOfChars(String str){
        /*
        To find out frequency of chars in a string first we need a nested loops. First loop will take one Char from a
        String than inner loop will run through the all String and count if there is any matches. If yes we will count it
        up.

        After inner loop is done we will make sure firstly that that result is not already in our result String. If we have
        such a result than we will skip. If no we add it  to our result Current char and add value of counted.
         */
        String result=""; // My result String which will store Chars and their appearance number

        for (int i = 0; i < str.length(); i++) { // First loop to take one char
            int count=0; // My counter of char appearances in a String
            for (int j = 0; j < str.length(); j++) { // Inner loop which will compare the element from outer loop with all string
                if(str.charAt(i)==str.charAt(j)){ // If outer char equal to current char
                    count++; // +1 to count
                }
            }
            if (result.contains(""+str.charAt(i))){ // If my result has already such a char
                continue; // Yes skip
            } else {  // If it doesn't have added to my result
                result += ""+str.charAt(i)+count; // Adding to result
            }
        }

        return result;
    }
}