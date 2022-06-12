package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minara2 {
    public static void main(String[] args) {
        String s = "|**|*|*";
        List<Integer> listStart = new ArrayList<>(Arrays.asList(1,1));
        List<Integer> listEnd = new ArrayList<>(Arrays.asList(5,6));

        System.out.println( numberOfItems(s, listStart, listEnd));

    }

    public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices){

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < startIndices.size(); i++) {
            int start = startIndices.get(i);
            int end = endIndices.get(i);
            String str = s.substring(start-1, end);
            str = str.substring( str.indexOf('|'), str.lastIndexOf('|')+1).replaceAll("\\|", "");
            result.add(str.length());
        }
        return result;
    }
}
