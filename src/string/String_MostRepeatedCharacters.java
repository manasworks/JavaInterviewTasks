package string;

import java.util.*;

public class String_MostRepeatedCharacters {
    public static void main(String[] args) {
        String str = "Today, is the greatest day evar!";
        System.out.println( SearchingChallenge(str));
    }

    public static String SearchingChallenge(String s){
        int max=0;
        String result="-1";

        String[] words = s.replaceAll("\\p{Punct}", "").toLowerCase().split("\\s+");

        for (String word : words) {
            String[] letters = word.split("");
            int f = frequency(letters);
            if (f>max){
                max = f;
                result = word;
            }
        }
        return result;
    }

    public static int frequency(String[] arr){
        int count=0, max=1;
        for (String c : arr) {
            int freq = Collections.frequency(Arrays.asList(arr), c);
            if (freq>max){
                max=freq;
                count+=max;
            }
        }
        return count;
    }
}
/*
Have the function SearchingChallenge(str) take the str parameter being passed and return the first word with
the greatest number of repeated letters. For example: "Today, is the greatest day ever!" should return
greatest because it has 2 e's (and 2 t's) and it comes before ever which also has 2 e's. If there are
no words with repeating letters return -1. Words will be separated by spaces.
Examples
Input: "Hello apple pie"
Output: Hello
Input: "No words"
Output: -1
 */