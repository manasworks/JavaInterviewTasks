package list;

import java.util.*;
import java.util.stream.Collectors;

public class ListCountOccurrences {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("App,le", "a,,pple ", "12bat", "  14BAT", "", "car", "C A R ", "ap~!$#!#$ple", null));
        List<String> list2 = new ArrayList<>();

        System.out.println( solution(list1) );
        System.out.println( solution(list2) );
    }

    public static Map solution(List<String> list){
        list.removeIf(Objects::isNull);
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            s=s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
            if (s.isBlank() || s.isEmpty()) continue;
            if (map.containsKey(s)) map.put(s, map.get(s)+1);
            else map.put(s, 1);
        }
        return map;
    }
}


