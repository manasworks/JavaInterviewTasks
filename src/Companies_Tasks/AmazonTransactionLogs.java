package Companies_Tasks;

import java.util.*;

public class AmazonTransactionLogs {
    public static void main(String[] args) {

        List<String> logs1 = new ArrayList<>(Arrays.asList("9 7 50", "22 7 20", "33 7 50", "22 7 30"));
        System.out.println( processLogs(logs1, 3));

        List<String> logs2 = new ArrayList<>(Arrays.asList("1 2 50", "1 7 70", "1 3 20", "2 2 17"));
        System.out.println( processLogs(logs2, 2));
    }

    public static List<String> processLogs(List<String> logs, int threshold){
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (String log : logs) {
           String[] arr = log.split(" ");

           if (map.containsKey(arr[0])) map.put(arr[0], map.get(arr[0])+1);
           else map.put(arr[0], 1);

           if (!arr[0].equals(arr[1])){
               if (map.containsKey(arr[1])) map.put(arr[1], map.get(arr[1])+1);
               else map.put(arr[1], 1);
           }

        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()>=threshold) result.add(entry.getKey());
        }

        return result;
    }
}
