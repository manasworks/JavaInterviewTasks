/*
In the Fibonacci series, the next number is the sum of previous two numbers.
For example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, etc... The first two numbers of the Fibonacci series are 0 and 1. (Counting starts with an index 0, so the 0th number is 0, 1st number is 1, etc)

You are given a number num, print n-th Fibonacci Number.

Examples:

Input  : 2
Output : 1
(Explanation : because number 2 in the sequence of 0, 1, 1 --> 1)
Input  : 2
Output : 1
(Explanation : because number 2 in the sequence of 0, 1, 1 --> 1)
Input  : 8
Output : 21
(Explanation : because number 8 in the sequence of
  0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21)
 */
package numbers;

import java.util.Arrays;

public class Number_Fibonacci {
    public static void main(String[] args) {
        int num = 12;
        fibonacci(num);
        System.out.println(Arrays.toString( fibonacciArray(num)) );
    }

    public static void fibonacci(int num){
        int sum=0, prevNum=1, nextNum=1;
        for (int i = 0; i < num; i++) {
            System.out.print(prevNum+", ");
            sum=prevNum+nextNum;
            prevNum=nextNum;
            nextNum=sum;
        }
        System.out.println();
    }

    public static int[] fibonacciArray(int num){
        // Declare an array to store
        // Fibonacci numbers.
        // 1 extra to handle case, n = 0
        int[] fibArray = new int[num];

        fibArray[0]=1;
        fibArray[1]=1;

        for (int i = 2; i <num ; i++) {
            fibArray[i] = fibArray[i-1]+fibArray[i-2];
        }

        return fibArray;
    }
}
