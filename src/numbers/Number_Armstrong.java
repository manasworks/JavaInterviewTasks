/*
Write a method that can check if a number is Armstrong number

In case of an Armstrong number of 3 digits, the sum of cubes of each digits is equal to the number itself.
For example: 153 = 1*1*1 + 5*5*5 + 3*3*3 // 153 is an Armstrong number.
 */
package numbers;

public class Number_Armstrong {
    public static void main(String[] args) {
        // Armstrong numbers: 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748
        int num=9;

        System.out.println( isArmstrong(num));
        System.out.println( isArmstrong2(num));
        isArmstrongPrint(500);
    }
    /*
    To find if number is Armstrong first we need to find how many digits we have. Then we need take each number from a
    digit and multiply it digit times or get the power of number by digit.
     */
    public static boolean isArmstrong(int num){ // First method using string
        String digits = ""+num; // Converting my num to a String
        int sum=0; // For result
        for (int i = 0; i < digits.length(); i++) { // Running loop for length of my string which is number of my digits
            int currentNum = Integer.parseInt(""+digits.charAt(i)); // Taking each number from a digit to int value
            sum+=Math.pow(currentNum, digits.length()); // Adding my sum with number power of total digits
              // Math.pow(X,Y) method return X power of Y like if Y=4 we  will get : X * X * X * X
        }
        return num==sum; // Check if they are equals.
    }

    public static boolean isArmstrong2(int num){ // Second approach working with numbers only
        int digits=0, copyNum=num, result=0;
        while (copyNum>0){
            digits++;
            copyNum = copyNum / 10;
        }
        copyNum=num;
        for (int i = 0; i < digits; i++) {
            int current=1;
            int currentNum = copyNum % 10;
            for (int j = 0; j < digits; j++) {
                current*=currentNum;
            }
            result += current;
           // result += Math.pow(currentNum, digits);
            copyNum = copyNum / 10;
        }
        return num==result;
    }

    public static void isArmstrongPrint(int number){ // Second approach working with numbers only
        for (int k = 1; k <= number; k++) {

            int num=k;
            int digits=0, copyNum=num, result=0;

            while (copyNum>0){
                digits++;
                copyNum = copyNum / 10;
            }
            copyNum=num;
            for (int i = 0; i < digits; i++) {
                int current=1;
                int currentNum = copyNum % 10;
                for (int j = 0; j < digits; j++) {
                    current*=currentNum;
                }
                result += current;
                copyNum = copyNum / 10;
            }
            if (result==num) {
                System.out.println(num+" is Armstrong");
            }
        }



    }
}