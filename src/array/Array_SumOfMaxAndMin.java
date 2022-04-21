package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Array_SumOfMaxAndMin {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());

        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        miniMaxSum(arr);

        //bufferedReader.close();
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        Collections.sort(arr);
        long min=0;
        long max=0;
        for (int i = 0; i < 4; i++) {
            min+=arr.get(i);
            max+=arr.get(arr.size()-1-i);
        }
        System.out.println(min+" "+max);


    }
}
