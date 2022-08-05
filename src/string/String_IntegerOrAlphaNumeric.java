package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_IntegerOrAlphaNumeric {
    public static void main(String[] args) {
        String str = "12345";

        System.out.println( solution(str) );
    }

    static String solution(String str){
        String result="";
        if (!str.matches("[0-9]+")){
            return "Entered string is AlphaNumeric";
        } else{
            int num=Integer.parseInt(str), i=0;
            int[] arr = new int[str.length()];
            while (num>0){
                arr[i++]=num%10;
                num/=10;
            }
            int sum = Arrays.stream(arr).sum();
            result = ""+sum;
        }
        return result;
    }
}
