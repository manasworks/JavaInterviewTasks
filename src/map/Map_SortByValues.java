/*
    Write a method that can sort the map by values
    Input : Key = Math, Value = 98
        Key = Data Structure, Value = 85
        Key = Database, Value = 91
        Key = Java, Value = 95
        Key = Operating System, Value = 79
        Key = Networking, Value = 80

    Output : Key = Operating System, Value = 79
         Key = Networking, Value = 80
         Key = Data Structure, Value = 85
         Key = Database, Value = 91
         Key = Java, Value = 95
         Key = Math, Value = 98
 */

package map;

import java.util.*;

public class Map_SortByValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Math", 98);
        map.put("Data Structure", 85);
        map.put("Database", 91);
        map.put("Java", 95);
        map.put("Operating System", 79);
        map.put("Networking", 80);

        System.out.println(map);
        System.out.println(sortedMap1(map));
        System.out.println(sortedMap2(map));
    }

    public static Map<String, Integer> sortedMap1(Map<String, Integer> map){

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }

    public static Map<String, Integer> sortedMap2(Map<String, Integer> map){
        Map<Integer, String> sorted = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sorted.put(entry.getValue(), entry.getKey());
        }
        map = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : sorted.entrySet()) {
            map.put(entry.getValue(), entry.getKey());
        }
        return map;
    }
}
