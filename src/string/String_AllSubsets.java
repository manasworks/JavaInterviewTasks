package string;

import java.util.ArrayList;
import java.util.List;

public class String_AllSubsets {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(allSubsets(str));
    }

    static List<String> allSubsets(String str){
        int len = str.length();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j <= len; j++) {
                result.add(str.substring(i,j));
            }
        }
        return result;
    }
}
