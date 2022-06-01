package tasks;

import java.util.HashMap;
import java.util.Map;

public class test1112 {
    public static void main(String[] args) {

        int[] arr = {19,6,7,22,3,5,6,6,7};

        System.out.println("frequency(arr) = " + frequency(arr));
    }

    static Map frequency(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for (int each : arr) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each)+1);
            } else {
                map.put(each, 1);
            }
        }

        return map;
    }
}
