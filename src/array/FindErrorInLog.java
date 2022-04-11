package array;

// A -> B -> C -> ERROR
// A -> C -> B -> No ERROR
// C -> B -> A -> No ERROR
// A -> B -> B -> A -> No ERROR
// Create a function that outputs all the users who experienced the error.
// Logs are in chronological order from when the occurred.

import java.util.HashMap;
import java.util.Map;

public class FindErrorInLog {
    public static void main(String[] args) {
        String[] logs = {
                "A:1",
                "A:1",
                "A:2",
                "A:3",
                "A:1",
                "B:1",
                "B:1",
                "B:2",
                "B:3",
                "A:3",
                "C:3",
                "C:2",
                "C:1",
                "B:1",
                "C:1"
        };

        errorsOccurred(logs);

    }

    static void errorsOccurred(String[] arr){
        Map<String, String> logsMap=new HashMap<>();
        for (String each : arr) {
            logsMap.put(""+each.charAt(2), (logsMap.get(""+each.charAt(2))!=null)?logsMap.get(""+each.charAt(2))+each.charAt(0):""+each.charAt(0));
        }
        for (Map.Entry<String, String> entry : logsMap.entrySet()) {
            if (entry.getValue().contains("ABC")) {
                System.out.println("User "+entry.getKey()+" Experienced error");
            }
        }
    }
}
