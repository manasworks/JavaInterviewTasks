package tasks;

import java.util.HashMap;
import java.util.Map;

public class ArstanTask {

    // Function to return country of given name
    public static void main(String[] args) {

        System.out.println(country( "Logan"));
    }

    public static String country(String name){
        Map<String, String > users = new HashMap<>();
        users.put("Logan", "Cali" );
        users.put("Paul", "LA");
        users.put("Ed", "Bucharest");
        users.put("Camilia", "Madrid");

        Map<String, String> locations = new HashMap<>();
        locations.put("Cali", "US");
        locations.put("LA", "US");
        locations.put("Bucharest", "Romania");
        locations.put("Madrid", "Spain");

        for (Map.Entry<String, String> entry : users.entrySet()) {
            if (entry.getKey().equals(name)){
                return locations.get(entry.getValue());
            }
        }

        return "Not found";
    }
}

