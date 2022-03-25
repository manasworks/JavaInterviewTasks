/*
Write a method that can divide two numbers without using division operator
 */

package numbers;

public class Number_DivideWithoutDivision {
    public static void main(String[] args) {
        int a=7;
        int b=3;

        System.out.println("divide("+a+"/"+b+") = " + divide(a, b));

    }

    public static double divide(int a, int b){
        double num1=0, num2=0.0;
        double remainder=a%b*10;
        while (a>=b){
            a-=b;
            num1++;
        }
        while (remainder>=b){
            remainder-=b;
            num2+=0.1;
        }
        return num1+num2;
    }
}