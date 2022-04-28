package map;

import java.util.*;
import java.util.stream.Collectors;

public class Map_MostFrequentValue {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(85, "Ozan");
        students.put(86, "Ozan");
        students.put(93, "Ali");
        students.put(98, "Ozan");
        students.put(87, "Ozan");
        students.put(92, "Ali");
        students.put(89, "Maria");
        students.put(74, "Ali");
        students.put(32, "Ali");

        System.out.println("mostFrequentValue1 = " + mostFrequentValue(students));
        System.out.println("mostFrequentValue2 = " + mostFrequentValue2(students));

    }

    public static String mostFrequentValue(Map<Integer, String> map){
        List<String> list = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        int max=0;
        String res="";
        for (String each : list) {
            int f= Collections.frequency(list, each);
            if (f>max){
                max=f;
                res=each;
            }
        }
        return res;
    }

    public static String mostFrequentValue2(Map<Integer, String> map){
        Map<String, Long> newMap = map.values().stream().collect(Collectors.groupingBy(p -> p, Collectors.counting()));
        return newMap.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
    }
}
