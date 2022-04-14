package string;

import java.util.*;

public class String_Reverse {
    public static void main(String[] args) {

        String[] array = {"Ram", "Sam", "Ram", "Sam", "Cam", "Tam"};
        Map<String, Integer> map = new HashMap<>();
        for (String each : array) {
            int freq = Collections.frequency(Arrays.asList(array), each);
            map.put(each, freq);
        }
        System.out.println("Map = "+map);

        String result="";
        for (String s : array) {
            int count=0;
            for (String e : array) {
                if (s.equals(e)) count++;
            }
            if(!result.contains(s)) result+=s+"="+count+" ";
        }

        System.out.println("result = " + result);

    }
}
