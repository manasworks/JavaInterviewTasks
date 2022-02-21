/*
write a function that can return the sum of digits of an integer Do not use any string manipulations
    Ex:
        input: 123
        output: 6
 */
package numbers;

public class Number_SumOfDigitsOfInteger {
    public static void main(String[] args) {
        int num=123;
        System.out.println( sumOfDigits(num) );
    }

    public static int sumOfDigits(int num){
        int result=0;
        while (num>0){
            result+=num%10;
            num/=10;
        }
        return result;
    }
}