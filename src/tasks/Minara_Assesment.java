package tasks;

import java.util.*;

public class Minara_Assesment { // Cisco
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(7,1,1,2,3,3,4,4)); // 4,1,1,2,2  //7,1,1,2,3,3,4,4
       // System.out.println( find_joey(numbers));

        System.out.println(nextNumber(225)); // 111221 - 1211
    }

    static int find_joey(List<Integer> num_array){
        int min=Integer.MAX_VALUE;
        int result=-1;
        for (int i = 1; i < num_array.size(); i++) {
            int count=0;
            for (int j = 1; j < num_array.size(); j++) {
                if(Objects.equals(num_array.get(i), num_array.get(j))) count++;
            }
            if (count==1) {
                result=num_array.get(i);
                if (result<min) min = result;
            }
        }
        return min;
    }

    public static int nextNumber(int num){ //225 // 2215
        StringBuilder res = new StringBuilder();
        Map<Integer, Integer> map = new TreeMap<>();
        List<Integer> digits = new ArrayList<>();

        boolean keyChange=false;

        while (num>0){
            digits.add(num%10);
            num/=10;
        }
        Collections.reverse(digits);

        for (int i = 1; i < digits.size(); i++) {
            if (digits.get(i-1)==digits.get(i)){
                res.append(digits.get(i - 1));
                res.append(digits.get(i));
            } else {
                res.append(digits.get(i - 1)).append("-");
            }
        }
        System.out.println(res);
        String[] m = res.toString().split("-");

        res= new StringBuilder("");

        for (String each : m) {
            res.append(each.length()).append(each.charAt(0));
        }

        return Integer.parseInt(res.toString());

    }
}
