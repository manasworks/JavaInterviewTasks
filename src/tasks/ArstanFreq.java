package tasks;

import java.util.HashMap;
import java.util.Map;

public class ArstanFreq {
    public static void main(String[] args) {
        String str = "Java one of the best code java volt java";

        System.out.println(freqOfWordAndReverse(str, "Java"));
    }

//    public static String freqOfWordAndReverse(String str, String wordToReverse){
//        String[] words = str.replaceAll("\\p{Punct}", "").split("\\s+");
//        int count=0;
//        StringBuilder result= new StringBuilder();
//        for (String word : words) {
//            if (word.equalsIgnoreCase(wordToReverse)){
//                count++;
//                result.append(new StringBuilder(word).reverse()).append(" ");
//            } else {
//                result.append(word).append(" ");
//            }
//        }
//        return result.append(" Frequency is: "+count).toString();
//    }

    public static String freqOfWordAndReverse(String str, String wordToReverse){
        String[] words = str.split(" ");
        int count=0;
        String result="";
        for (String word : words) {
            if (word.equalsIgnoreCase(wordToReverse)){
                count++;
                result+=(new StringBuilder(word).reverse())+" ";
            } else {
                result+=word+" ";
            }
        }
        return result+" Frequency is: "+count;
    }
}

