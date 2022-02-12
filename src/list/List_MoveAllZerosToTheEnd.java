/*
    write a program that can move all the zeros to the end of the List of integers
    Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
    Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
 */

package list;

import java.util.ArrayList;
import java.util.Arrays;

public class List_MoveAllZerosToTheEnd {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1, -2, 0, 4, 3, 0, 5, 0));
        System.out.println(list);

        System.out.println(moveToEnd(list, 0));
    }

    public static ArrayList<Integer> moveToEnd(ArrayList<Integer> list, int numToMove){
        /*
        To remove given number like 0 from array list we can just run the loop.
        Remove the number and add it back. That wat our zero will appear at the end.
         */
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==numToMove){
                list.remove(i);
                list.add(numToMove);
            }
        }
        return list;
    }
}