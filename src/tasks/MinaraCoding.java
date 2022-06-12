package tasks;

import java.util.HashMap;
import java.util.Map;

public class MinaraCoding {
    public static void main(String[] args) {
        String s1 = "make";
        String s2 = "mke";

        System.out.println( solution( s1, s2));
        System.out.println( isOneEdit(s1, s2));
    }

    public static boolean solution(String s1, String s2){
        int c=0;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            if (map1.containsKey(s1.charAt(i))) map1.put(s1.charAt(i), map1.get(s1.charAt(i))+1);
            else map1.put(s1.charAt(i), 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            if (map2.containsKey(s2.charAt(i))) map2.put(s2.charAt(i), map2.get(s2.charAt(i))+1);
            else map2.put(s2.charAt(i), 1);
        }

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (map1.get( entry.getKey())==null) c++;
            if (map2.get( entry.getKey())==null) c++;
        }
        return c==1;
    }

    private static boolean isOneEdit(String first, String second) {
        // if the input string are same
        if (first.equals(second))
            return false;

        int len1 = first.length();
        int len2 = second.length();
        // If the length difference of the stings is more than 1, return false.
        if ((len1 - len2) > 1 || (len2 - len1) > 1  ) {
            return false;
        }
        int i = 0, j = 0;
        int diff = 0;
        while (i<len1 && j<len2) {
            char f = first.charAt(i);
            char s = second.charAt(j);
            if (f != s) {
                diff++;
                if (len1 > len2)
                    i++;
                if (len2 > len1)
                    j++;
                if (len1 == len2)
                    i++; j++;
            }
            else{
                i++; j++;
            }
            if (diff > 1) {
                return false;
            }
        }
        // If the length of the string is not same. ex. "abc" and "abde" are not one edit distance.
        if (diff == 1 && len1 != len2 && (i != len1 || j != len2)) {
            return false;
        }
        return true;
    }
}
