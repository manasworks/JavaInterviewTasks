package string;

import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=new StringBuilder(A).reverse().toString();


        System.out.println("B = " + B);

    }
}
