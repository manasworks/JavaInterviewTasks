package map;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aaaafffeeesddfdllxlcklklcv";

        String[] arr = str.split("");
        Map<String, Integer> map = new HashMap<>();

        for (String each : arr) {
            map.put(each, Collections.frequency(Arrays.asList(arr), each));
        }

        System.out.println(map);
    }
}
