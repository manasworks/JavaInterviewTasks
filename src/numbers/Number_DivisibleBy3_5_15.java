/*
Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
        if the number can be divisible by 3, 5 and 15,
            then it should only be displayed in DivisibelBy15' section
        if the number can be divisible by 3 but cannot be divisible by 15,
            then it should only be displayed in DivisibelBy3' section
        if the number can be divisible by 5 but cannot be divisible by 15,
            then it should only be displayed in DivisibelBy5' section
    EX:
        input: 100
        Output:
             Divisible By 15 15 30 45 60 75 90
             Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
             Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
*/
package numbers;

public class Number_DivisibleBy3_5_15 {
    public static void main(String[] args) {
        int num=100;
        divisible(num);
    }

    public static void divisible(int num){
        // We will use remainder operator if remainder of 15, 5 or 3 equals to zero than that mean that's our number

        String divisible15="Divisible By 15: ", divisible5="Divisible By 5: ", divisible3="Divisible By 3: ";

        for (int i = 1; i <=num ; i++) {
            if (i%15==0){
                divisible15+=i+" ";
            } else if (i%5==0){
                divisible5+=i+" ";
            } else if (i%3==0) {
                divisible3+=i+" ";
            }
        }
        System.out.println(divisible15);
        System.out.println(divisible5);
        System.out.println(divisible3);
    }
}
