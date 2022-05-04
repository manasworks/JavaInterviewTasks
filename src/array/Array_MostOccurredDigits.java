package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Array_MostOccurredDigits {

    public static void main(String[] args) {
        int[] a = {25,2,3,57,38,41};

        System.out.println("mostOccurred(a) = " + mostOccurred(a));
    }

    public static List<Integer> mostOccurred(int[] arr){

        Map<Integer, Integer> digit = new HashMap<>();
        int maxValue=Integer.MIN_VALUE;

        for (int each : arr) {
            int num = each;
            while (num>0){
                if (digit.containsKey(num%10)){
                    digit.put(num%10, digit.get(num%10)+1);
                } else {
                    digit.put(num%10, 1);
                }
                if (digit.get(num%10)>maxValue) maxValue=digit.get(num%10);
                num/=10;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> each : digit.entrySet()) {
            if (each.getValue()==maxValue) result.add(each.getKey());
        }

        return result;
    }
}
