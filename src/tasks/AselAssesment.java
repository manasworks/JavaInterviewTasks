package tasks;

import java.util.HashMap;
import java.util.Map;

public class AselAssesment {
    public static void main(String[] args) {
        int[] arr =  {1,-2,-2,-5,-5,-5,6};  // {1,-2,-2,-5,-5,-5,6} // {1,2,2,2,3}

        System.out.println( Dis(arr));
    }

    public static int Dis(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key=arr[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            }
            else {
                map.put(key, 1);
            }
        }
        int dublicates=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>1)  dublicates+= (entry.getValue()-1);
        }
        return dublicates;
    }
}
