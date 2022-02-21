/*
Swap two variable' values without using a third variable
 */
package numbers;

public class Number_SwapTwoNumbers {
    public static void main(String[] args) {
        int a=15;
        int b=10;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}