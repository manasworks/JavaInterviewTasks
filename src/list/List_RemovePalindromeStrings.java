/*
     remove palindrome strings from a List of String
 */

package list;

import java.util.ArrayList;
import java.util.Arrays;

public class List_RemovePalindromeStrings {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>(Arrays.asList("deified", "civic", "radar", "level", "rotor", "kayak", "result"));
        removePalindromes(list);
        System.out.println(list);

    }

    /*
    To remove palindrome String from an Array List we need compare original string with reversed if they are equal
    than we can remove it from our list.
    Will create 2 methods one will just with removeIf remove any reversed equals and other will reverse the strings
     */
    public static ArrayList<String> removePalindromes(ArrayList<String> list){
        list.removeIf(p-> p.equals(reverse(p)));
        return list;
    }

    public static String reverse(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
}