/*
return the number of '1's in the binary representation of n for any integer n, where n > 0
Example:
    for n=6 the binary representation is '110' and the number of '1's in that representation is 2
 */

package numbers;

public class Number_BinaryRepresentationOfN {
    public static void main(String[] args) {
        int num=6;
        System.out.println( convertToBinary(num));
    }
    /*
    Decimal (10) > Binary (2)
                0=0
                1=1
                2=10
                3=11
                ...
                Basically we have our decimal divided by 2 and remainder 1 or 0 is or digit
     */

    public static String convertToBinary(int num){
        String binary=""; // To hold binary value
        while (num>0){ // Do the code while my num still bigger than 0
            binary=num%2+binary; // Getting remainder of num and adding it to left side of value.
            num= num/2; // Dividing my num by 2
        }
        return binary;
    }
}