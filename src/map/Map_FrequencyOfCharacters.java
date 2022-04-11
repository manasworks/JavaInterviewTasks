package map;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aAabdivctlroROfjvalkj1291dD";

        String[] arr = str.split("");
        Map<String, Integer> map = new HashMap<>();

        for (String each : arr) {
            int freq = Collections.frequency(Arrays.asList(arr), each);
            map.put(each, freq);
        }

        System.out.println(map);
    }
}
