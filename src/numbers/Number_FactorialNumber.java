/*
Write a return method that returns the factorial number of any given number
    Ex:
            Input: 5
            outPut: 120
            because 5 * 4 * 3 * 2 * 1 = 120
 */
package numbers;

public class Number_FactorialNumber {
    public static void main(String[] args) {

        int num=5;
        System.out.println( factorial(num) );
    }

    public static long factorial(int num){

        // To find a factorial we will use a loop and multiple our current i as many times as given umbers is

        long result=1;

        for (int i = 1; i <=num ; i++) {
            result *= i;
        }

        return result;
    }
}