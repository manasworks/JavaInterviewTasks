package string;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_MostCommonVowels {
    public static void main(String[] args) {
        String s = "lexicon";

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
        boolean singleRes=true;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue()==max) {
                String newLine = (singleRes)?"":"\n";
                result.append(newLine).append(e.getKey()).append(" appears ").append(e.getValue()).append(" times");
                singleRes=false;
            }
        }
        return result.toString();

    }
}
