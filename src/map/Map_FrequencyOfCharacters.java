package map;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Map_FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "conferencing";  //enterprise  //conferencing

        String[] arr = str.split("");
        Map<String, Integer> map = new HashMap<>();

        for (String each : arr) {
            int freq = Collections.frequency(Arrays.asList(arr), each);
            map.put(each, freq);
        }
        System.out.println(map);

        Map<Character, Long> frequency =
                str.chars().mapToObj(c -> (char)c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequency);
    }
}
