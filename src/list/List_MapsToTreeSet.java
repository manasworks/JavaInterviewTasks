package list;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toCollection;

public class List_MapsToTreeSet {
    public static void main(String[] args) {
        List<Map<String, Object>> myList = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("value1", 3);
        map1.put("value2", 11);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("value1", 8);
        map2.put("value2", 16);

        Map<String, Object> map3 = new HashMap<>();
        map3.put("value1", 3);
        map3.put("value2", 11);

        Map<String, Object> map4 = new HashMap<>();
        map4.put("value1", 10);
        map4.put("value2", 11);

        myList.add(map1);
        myList.add(map2);
        myList.add(map3);
        myList.add(map4);

        List<Map.Entry<String, Object>> list = myList.stream().flatMap(map -> map.entrySet().stream())
                .filter(s -> filterFuction(s)).filter(distinctByValue(entry -> entry.getValue()))
                .collect(Collectors.toList());

        List<Map<String, Object>> list1 = list.stream().map(t -> {
            Map<String, Object> map = new HashMap<>();
            map.put(t.getKey(), t.getValue());
            return map;
        }).collect(Collectors.toList());
        System.out.println(list1);
    }

    public static <T> Predicate<T> distinctByValue(Function<? super T, ?> keyExtractor) {

        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    public static boolean filterFuction(Map.Entry<String, Object> entry) {
        if (entry.getKey().equals("value2"))
            return true;
        return false;
    }

}

