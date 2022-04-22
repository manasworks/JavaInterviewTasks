package string;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_MostCommonVowels {
    public static void main(String[] args) {
        String s = "e should be the common vowel in this sentence";

        System.out.println(solution(s));
    }

    static String solution(String s){
        String[] arr = s.toLowerCase().replaceAll("[^aeiou]", "").split("");

        StringBuilder result = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();

        int max=0;
        for (String each : arr) {
            int freq = Collections.frequency(Arrays.asList(arr), each);
            if (freq>max) max=freq;
            map.put(each, freq);
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue()==max) result.append(e.getKey()).append(" appears ").append(e.getValue()).append(" times\n");
        }
        return result.toString();

    }
}
