package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("Hello, world! world");
        s.add("Welcome to CoderPad.");
        s.add("This pad is running Java " + Runtime.version().feature());

        removeRepededwords(s);

        System.out.println(s);
    }

    public static List<String> removeRepededwords(List<String> list){
        int i=0;
        for (String each : list) {
            String[] words = each.replaceAll("\\p{Punct}", "").split("\\s+");
            StringBuilder res = new StringBuilder();
            for (String word : words) {
                int f = Collections.frequency(Arrays.asList(words), word);
                if (f==1) res.append(word).append(" ");
            }
            list.set(i++, res.toString());
        }
        return list;
    }


}
