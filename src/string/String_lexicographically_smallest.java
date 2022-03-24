/*
The numeric value of a lowercase character is defined as its position (1-indexed) in the alphabet,
so the numeric value of a is 1, the numeric value of b is 2, the numeric value of c is 3, and so on.

The numeric value of a string consisting of lowercase characters is defined as the sum of its characters'
numeric values. For example, the numeric value of the string "abe" is equal to 1 + 2 + 5 = 8.

You are given two integers n and k. Return the lexicographically smallest string with length equal
to n and numeric value equal to k.

Note that a string x is lexicographically smaller than string  y  if x comes before y in dictionary order,
that is, either x is a prefix of y, or if i is the first position such that x[i] != y[i], then x[i] comes before y[i] in alphabetic order.

 */
package string;


import java.util.Arrays;

public class String_lexicographically_smallest {
    public static void main(String[] args) {

        System.out.println(lexicographicallySmallest(5, 73));
        System.out.println(sultansSolution(5,73));
        System.out.println(minValueOfString(5, 73));

    }

    public static String lexicographicallySmallest(int length, int sum){
        StringBuilder result= new StringBuilder();
        if (length>sum) return "Invalid input. Sum can not be smaller than length";

        // Creating int array to store my numbers
        int[] arr = new int[length];
        // Populating my array with 1 ones.
        Arrays.fill(arr, 1);

        // Starting my nested loop from the last digit. Up to 26 max letter "z" filling it up till the sum is matched
        for (int i = arr.length-1; i >=0 ; i--) {
            for (int j = 1; j <= 26 ; j++) {
                arr[i]=j;
                int sumOfDigits=0;
                for (int each : arr) sumOfDigits+=each;
                if (sumOfDigits==sum) {
                    // Converting my int array to string
                    for (int each : arr) result.append((char) (each + 96));
                    return result.toString();
                }
            }
        }
        return "Something went wrong";
    }

    static String sultansSolution(int n, int k){
        String result = "";  //empty string where the result will be generated.

        for (int i = 1; i <= n; i++) {      // loop for the length of the string. We are going from 1->n so that we can use the value of i in the equations below.
            if ((26 <= (k - (n - i)))) {    //if k is more than 26 after assuming all the other letters of the string are 'a',
                result = 'z' + result;      //add a 'z' to the front of whatever letters are already in the string
                k -= 26;                    //subtract 26 from k for the 'z' we added in the above line.
            } else {
                int last = 122 - (26 - (k - (n - i)));//using the ascii table -->  'z' - 26-(k-(n-1)).  This assumes the rest of the letters can be a, and populates the highest letter count possible
                result = (char)last + result;   //ascii value of character cast into char, add char from above to the front of the string.
                k -= (last - 96);           //subtract value of character from k
            }

        }
        return result;
    }

    public static  char[] minValueOfString(int n, int k){
        char [] numValue = new char[n];
        for (int i = 0; i < n; i++) {
            numValue[i] = 'a'; //[a,a,a,a,a,a,a,]
            k--;
        }
        while (k> 0){
            int number = Math.min(25,k);/// [z,z,z,z,z]
            numValue[--n] += number;
            k -= number;
        }
        return numValue;
    }
}