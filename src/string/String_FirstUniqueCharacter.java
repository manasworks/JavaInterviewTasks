/*
write a program that can return the first non-repeated character from a string
 */
package string;

import java.util.Arrays;
import java.util.Collections;

public class String_FirstUniqueCharacter {
    public static void main(String[] args) {
        String str="aa qbbcz ac";
        System.out.println(firstUnique(str));
        System.out.println(firstUnique2(str));
        System.out.println(firstUnique3(str));
    }

    public static String firstUnique(String str){

        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)) count++;
            }
            if (count==1) return ""+str.charAt(i);
        }
        return "no unique characters";
    }

    public static String firstUnique2(String str){
        String[] arr = str.split("");
        for (String each : arr) {
            int freq = Collections.frequency(Arrays.asList(arr), each);
            if (freq==1) return each;
        }
        return "no unique characters";
    }

    public static String firstUnique3(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) return ""+str.charAt(i);
        }
        return "no unique characters";
    }
}