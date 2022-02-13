/*
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */

package list;

import java.util.ArrayList;
import java.util.Arrays;

public class List_RemoveNumbers {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,6,1,200,156,32,3,666,0,999));
        removeGreater(list, 100);
        System.out.println(list);

    }

    public static ArrayList<Integer> removeGreater(ArrayList<Integer> list, int num){
        // Easy just removing any greater than num with removeIf method
        list.removeIf(p-> p>num);
        return list;
    }
}