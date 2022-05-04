package tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class test7 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        String str = "aabcb";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);

        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)) count++;
            }
            map2.put(str.charAt(i), count);
        }

        System.out.println(map2);


        Map<String, Integer> map3 = new HashMap<>();

        String[] arr = str.split("");
        for (String each : arr) {
            int freq = Collections.frequency(Arrays.asList(arr), each);
            map3.put(each, freq);
        }
        System.out.println(map3);
    }

}
