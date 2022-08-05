package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ass {
    public static void main(String[] args) {
        int[] arr = {4,5,7,8,9};
        int target = 11;

        System.out.println(findNums(arr, target));
    }

    static List<Integer> findNums(int[] arr, int target){

        HashMap<Integer, Integer> my_map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(1);
        for(int i = 0; i < arr.length; i++){
            if(my_map.containsKey(arr[i])){
                int index = my_map.get(arr[i]);
                result.set(0, index );
                result.set(1, i );
                break;
            }
            else{
                my_map.put(target - arr[i], i);
            }
            System.out.println(my_map);
        }
        return result;
    }
}
