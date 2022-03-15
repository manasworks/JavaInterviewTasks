package string;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        String str="Apple";
        System.out.println( frequencyOfChars(str) );
        System.out.println( frequencyOfChars2(str));
    }

    public static String frequencyOfChars(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)) count++;
            }
            if (!result.contains(""+str.charAt(i))) result += ""+str.charAt(i)+"="+count+", ";
        }
        return result.substring(0, result.length()-2);
    }

    public static Map frequencyOfChars2(String str){
        String[] arr = str.split("");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String each : arr) map.put(each, Collections.frequency(Arrays.asList(arr), each));
        return map;
    }
}
