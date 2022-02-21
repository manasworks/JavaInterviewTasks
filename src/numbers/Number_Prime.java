/*
    Write a method that can check if a number is prime or not
 */
package numbers;

public class Number_Prime {
    public static void main(String[] args) {
        int num=23;
        System.out.println( isPrime(num) );
    }
/*
A prime number is a natural number greater than 1,
which is only divisible by 1 and itself.
First few prime numbers are : 2 3 5 7 11 13 17 19 23
 */
    public static boolean isPrime(int num){
        int count=0;
        for (int i = 1; i <= num/2; i++) {
            if (num%i==0){
                count++;
            }
        }
        if (count==1) return true;
        return false;
    }
}