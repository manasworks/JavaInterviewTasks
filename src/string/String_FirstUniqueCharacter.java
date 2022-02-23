/*
write a program that can return the first non-repeated character from a string
 */
package string;

public class String_FirstUniqueCharacter {
    public static void main(String[] args) {
        String str="aasdsdmklrktlrA";
        System.out.println("First unique char is: " + firstUnique(str));
    }

    public static char firstUnique(String str){

        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)) count++;
            }
            if (count==1) return str.charAt(i);
        }
        return 'n';
    }
}