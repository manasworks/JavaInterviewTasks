/*
Write a method that will check if a number is palindrome
               Ex: isPalindorme(1221)-> True
                   isPalindrome(2132)-> False
 */
package numbers;

public class Number_isPalindrome {
    public static void main(String[] args) {
        int num=2132;

        System.out.println("isPalindrome("+num+") = " + isPalindrome(num));
        System.out.println("isPalindrome2("+num+") = " + isPalindrome2(num));
    }

    static boolean isPalindrome(int num){
        int reversed=0;
        int given=num;
        while (num>0){
            reversed=reversed*10+num%10;
            num=num/10;
        }
        return given==reversed;
    }

    static boolean isPalindrome2(int num){
        String given = ""+num;
        StringBuilder str = new StringBuilder(given);
        str.reverse();
        String reversed = str.toString();
        return given.equals(reversed);
    }
}