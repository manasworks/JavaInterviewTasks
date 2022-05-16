package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test8 {
    public static void main(String[] args) {
        String str = "This is the sentence";

        System.out.println( check(str) );
    }

    static List<String> check(String s){
        List<String> result = new ArrayList<>();
        String[] words = s.replaceAll("\\p{Punct}", "").split("\\s+");
        for (String each : words) {
            if (Character.isLowerCase(each.charAt(0))) result.add(each);
        }
        return result;
    }
}
