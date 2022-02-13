package array;

import java.util.Arrays;

public class Array_SortInDescendingOrder {
    public static void main(String[] args) {


            int [] arr = {1,4,7,3,9,-4,-2,8,0};
            //Arrays.sort(arr);
            System.out.println(Arrays.toString(DescendingSort(arr)));

        }

        public static int[] DescendingSort(int[] arr){

// for ascending sort we need to creat to loops, one main loop and second one nested loop.

            int temp = 0;// also, we need create a temporary storage for swapping numbers
            for (int i = 0; i < arr.length; i++) { //first main loop give us first element from arr
                for (int k = i + 1; k < arr.length; k++) {//nested loop, compare each element from main loop with every next element from arr in nested loop
                    if (arr[i] < arr[k]) {//if element smaller then next element
                        temp = arr[i];//we need to put smaller element in our temp container
                        arr[i] = arr[k];//replace bigger element with smaller element
                        arr[k] = temp;//take from temp container smaller and put him next to bigger element
                    }
                }
            }
            return arr;

        }
    }

