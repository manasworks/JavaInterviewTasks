/*
Write a function solution that, given an integer N, returns the maximum possible value
obtained by inserting one '5' digit inside the decimal representation of integer N.
Examples:
    1. Given N = 268, the function should return 5268
    2. Given N = 670, the function should return 6750.
    3. Given N = 0, the function should return 50.
    4. Given N = -999, the function should return -5999.
Assume that:
    • N is an integer within the range (-8,000..8,000).
In your solution, focus on correctness. The performance of your solution will
not be the focus of the assessment.
 */
package numbers;

public class Number_MaximumPossibleValue {
    public static void main(String[] args) {
        int n = 268;
        System.out.println( maxValue(n) );
    }
/*
To find Max value of number when inserted 5 we need get all possible values of that number first.
For example if we have 268 we need get 5268, 2568, 2658, 2685
To do so: I will convert my number to a string and then insert 5 by substring method.
but before that need to know if number is negative or positive. If negative will store to boolean that its negative and
take a absolute value of number by Math.abs method.
At the end will compare each possible inserted option with my max number and if it's max will return it.
 */
    public static int maxValue(int n){

        boolean negative=false;  // To store if number is negative
        int max=Integer.MIN_VALUE;  // My max number

        if (n<0) {  // If number is negative
            negative=true; // Negative true
            n=Math.abs(n); // Convert number to positive
        }

        String number=""+n;  // Creating a string of given number

        for (int i = 0; i < number.length()+1; i++) { // Starting a loop, +1 for extra iteration to get all options
            String temp=""; // Temp string number
            int currentNum = 0; // Current number in int

            if (i==number.length()) {  // If my i equals to length of string what means we came to end, and I need add 5 behind
                temp=number+5;
            } else { // If i not at end yet
                temp = number.substring(0, i)+5+number.substring(i); // Will add part of num + 5 + rest of the part
            }

            if (negative){  // Converting String to int and make sure if number was negative make it negative again
                currentNum = -Integer.parseInt(temp);
            } else {
                currentNum = Integer.parseInt(temp);
            }

            if (currentNum>max) {  // Checking if current number option is bigger than my Max number
                max=currentNum; // If yes re-assign it to max
            }
        }

        return max; // At the end will get maximum possible option with inserted 5
    }
}