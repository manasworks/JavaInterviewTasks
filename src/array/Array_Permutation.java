package array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array_Permutation {

    public static void main(String[] args) {

        char[] arr = {'A', 'B', 'C', 'D'};
        //giveAllCombinations(arr);
        permutation(arr);
        //permute(arr);

    }

    public static void giveAllCombinations(char[] arr){
        /*
        To get all possible combination from array we need to create nested loops and how many nested loops we need is
        depends on the number of values in array, or we can say the length of array. In our case we have 3 characters
        that's why we will need 3 nested loops. And to avoid value duplicated and hold permutation we will check if in
        sub nest value is not equal to upper

        Note: This is kind a hard code solution. Will work only if there is 3 elements...
         */

        for (char each : arr) {
            for (char sub : arr) {
                if(each==sub) continue;
                for (char last : arr) {
                    if(sub==last || each==last) continue;
                    System.out.println(each+", "+sub+", "+last);
                }
            }
        }
    }

    public static void permutation(char[] arr){
        // Second approach when flexible for any length of array, first loop is swapping first and second values
        // to run all possible variants and inner is shifting indexes from 1 till end.

        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length; j++) {
                char subTemp = arr[1];
                arr[1] = arr[j];
                arr[j] = subTemp;
                System.out.println(Arrays.toString(arr));
            }
            //Swap chars
            char temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }

//    public static void printPermutation(char[] ch) {
//
//        for(String s: permutation(ch))
//
//            System.out.println(Arrays.toString( s.toCharArray( ) )  );
//
//    }
//
//    public static Set<String> permutation(char[] ch) {
//
//        String str = Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", "");
//
//        Set<String> set = new LinkedHashSet<>();
//
//        if (str.length() == 1)
//
//            set.add(str);
//
//        else
//
//            for (int i=0; i<str.length(); i++){
//
//                String a3 = str.substring(0, i)+ str.substring(i+1);
//
//                char[] ch2 = a3.toCharArray();
//
//                for (String permutation : permutation(ch2))
//
//                    set.add(str.charAt(i) + permutation);
//
//            }
//
//        return set;
//
//    }





}
// Given an array of 3 characters print all permutation combinations from the given characters