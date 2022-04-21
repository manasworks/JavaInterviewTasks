package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CropTheString {
    public static void main(String[] args) {
        String message = "To crop or not to crop"; // 21
        String message2 = "The quick brown fox jumps over lazy dog"; // 39
        String message3 = "Codility We test coders"; // 14

        System.out.println("message2.length() = " + message2.length());

        System.out.println(solution3(message, 21));
        System.out.println(solution3(message2, 39));
        System.out.println(solution3(message3, 14));

        //To crop or not to
        //The quick brown fox jumps over lazy dog
        //Codility We
    }

    public static String solution1(String message, int K){
        if (K>=message.length()) return message;

        String[] words = message.split(" ");
        int totalLength=1;
        StringBuilder result= new StringBuilder();

        for (String word : words) {
            totalLength+=word.length();
            if (totalLength <= K) result.append(word).append(" ");
            else break;
        }
        return result.toString().trim();
    }

    public static String solution2(String message, int K) {
        while (message.length() > K) {
            message = message.substring(0, message.lastIndexOf(' ', K));
        }
        return message;
    }

    public static String solution3(String message, int K){
        int l=0;
        String[] words = message.split(" ");
        for (String word : words) {
            if (l+word.length()<=K) {
                l+=word.length()+1;
            }
        }
        return message.substring(0, l-1);
    }
}

