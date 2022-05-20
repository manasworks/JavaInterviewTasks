package tasks;

import java.util.HashMap;
import java.util.Map;

public class safdsd {
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


        Map<String, String> logsMap=new HashMap<>();
        for (String each : logs) {

            // Getting current log key USER ID
            String key=""+each.charAt(2);

            String value = "";
            // IF map had current some value to this key adding concatenating new else just new value
            if (logsMap.get(key)!=null){
                value = logsMap.get(key)+each.charAt(0);
            } else {
                value = ""+each.charAt(0);
            }

            //Putting to map
            logsMap.put(key, value);
        }

        for (Map.Entry<String, String> entry : logsMap.entrySet()) {
            if (entry.getValue().contains("ABC")) {
                System.out.println("User "+entry.getKey()+" Experienced error");
            }
        }
    }
}
