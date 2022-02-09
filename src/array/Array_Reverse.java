package array;

import java.util.Arrays;

public class Array_Reverse {

    public static void main(String[] args) {

        char[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        System.out.println("Original   "+Arrays.toString(arr));
        System.out.println("Reversed 1 "+Arrays.toString( reverse(arr) ) );
        System.out.println("Reversed 2 "+Arrays.toString( reverse2(arr) ) );

    }

    public static char[] reverse(char[] arr){
        /*
        First approach we will create a new same size array and assign values from back to beginning our new array
         */
        char[] result = new char[arr.length]; // New same size array
        for (int i = arr.length-1, j=0; i >= 0 ; i--, j++) { // i> starts from the end index of original array. j> from zero
            result[j] = arr[i]; // Assigning j to i
        }
        return result;
    }

    public static char[] reverse2(char[] arr){
        /*
        Second approach when we're swapping values first value with last. Then second with second from behind and so on.
        Our loop this way need less by half iterations to finish reversing all array and we no more needing new array.
         */
        for (int i = 0; i < arr.length/2; i++) { // Loop till middle of array length
            char temp = arr[i]; // Temp variable to hold our start value
            arr[i] = arr[ (arr.length-1)-i ]; // Assigning start with last value
            arr[(arr.length-1)-i] = temp; // Assigning last value with start
        }
        return arr;
    }
}
// write a function that can reverse an array