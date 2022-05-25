/*
return the number of '1's in the binary representation of n for any integer n, where n > 0
Example:
    for n=6 the binary representation is '110' and the number of '1's in that representation is 2
 */

package numbers;

import java.util.ArrayList;
import java.util.Collections;

public class Number_BinaryRepresentationOfN {
    public static void main(String[] args) {
        int num=1454548772;
        System.out.println( convertToBinary(num));


    }
    /*
    Decimal (10) > Binary (2)
                0=0
                1=1
                2=10
                3=11
                4=100
                5=101
                6=110
                7=111
                8=1000
                9=1001
                10=1010
                11=1011
                12=1100
                ...
                Basically we have our decimal divided by 2 and remainder 1 or 0 is or digit
     */

    public static String convertToBinary(int num){
        String binary=""; // To hold binary value
        ArrayList<Integer> list = new ArrayList<>();

        while (num>0){ // Do the code while my num still bigger than 0
            list.add(num%2); //0 0 1 1
            binary=num%2+binary; // Getting remainder of num and adding it to left side of value.
            num= num/2; // Dividing my num by 2
        }
        Collections.reverse(list);
        System.out.println(list);
        return binary;
    }


    // Function to print binary number
    static void printBinary(int[] binary, int id)
    {
        // Iteration over array
        for (int i = id - 1; i >= 0; i--)
            System.out.print(binary[i] + "");
    }

    // Function converting decimal to binary
    public static void decimalToBinary(int num) {
        // Creating and assigning binary array size
        int[] binary = new int[35];
        int id = 0;

        // Number should be positive
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }

        // Print Binary
        printBinary(binary, id);
    }
}