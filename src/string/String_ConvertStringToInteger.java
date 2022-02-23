/*
write a program that can convert a string to integer. DO NOT use parse or valueOf methods
 */
package string;

public class String_ConvertStringToInteger {
    public static void main(String[] args) {
        String str="509";
        System.out.println(stringToInt(str));
    }

    public static int stringToInt(String str){
        int result=0;
        for (int i = 0; i < str.length(); i++) {
            char num = str.charAt(i);
            result = result*10+charToInt(num);
        }
        return result;
    }

    public static int charToInt(char ch){
        int digit=0;
        if (ch=='1') digit=1;
        else if (ch=='2') digit=2;
        else if (ch=='3') digit=3;
        else if (ch=='4') digit=4;
        else if (ch=='5') digit=5;
        else if (ch=='6') digit=6;
        else if (ch=='7') digit=7;
        else if (ch=='8') digit=8;
        else if (ch=='9') digit=9;
        return digit;
    }


}