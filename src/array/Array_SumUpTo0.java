package array;

import java.util.Arrays;

public class Array_SumUpTo0 {
    public static void main(String[] args) {

        int num = 7;

        System.out.println(Arrays.toString(generator(num)));
    }

    public static int[] generator(int n){
        /*
        To generate an Array where sum of all elements will be Zero. We can mirror an array Like if our first is 100
        last should be -100. When number is odd we can either assign it to 0 or do half of the iterations divided by two
        that way we will skip the middle, and it will be zero by default. To fill the array I will be using
        Math random generator function and to prevent elements get duplicated will run while loop to be sure there is nu such
        number yet.
         */

        int[] result = new int[n]; // New array with the length of given number
        int randomNum = 0; // My variable to hold random numbers

        for (int i = 0; i < result.length/2; i++) { // My loop to populate array

            // Start to checking if such a number already in array
            boolean duplicate=true; // Initial boolean I will start assuming there is a duplicate
            while (duplicate){ // My loop till no such number is found
                int count=0; // Counter to count duplications
                randomNum = (int)(Math.random()*100); // Randomizing my number within 0-100 range
                for (int each : result) { // Checking my array if any element is equal to my random number
                    if (each==randomNum) count++; // If yes count +1
                }
                if (count==0) duplicate=false; // After array checked no duplicates found my count will be 0 and boolean becomes false and while loop stop executing
            }

            result[i] = -randomNum; // Assigning negative number to left side
            result[result.length-1-i]= randomNum; // Assigning positive number to right side
        }
        return result;
    }
}
//13	Write a function:
//    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
//    The function can return any such array.
//    For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
//    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
//    For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).