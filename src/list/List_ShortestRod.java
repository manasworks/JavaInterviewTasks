package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_ShortestRod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,3,4,9,22,99,1166));

        cutShortest(list);
    }

    public static void cutShortest(List<Integer> list){

        while (list.size()>0){
            System.out.println(list);
            int min=Integer.MAX_VALUE;
            for (Integer each : list) {
                if(each<min) min = each;
            }
            int finalMin = min;
            list.removeIf(p-> p== finalMin);
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i)-min);
            }
        }

    }
}
