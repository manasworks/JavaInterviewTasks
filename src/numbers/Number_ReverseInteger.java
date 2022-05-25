package numbers;

public class Number_ReverseInteger {
    public static void main(String[] args) {

        int num=1982;
        System.out.println( reverseNum(num) );
    }

    public static int reverseNum(int num){
        int reversed=0;

        while (num>0){
            reversed = reversed*10 + num%10;
            num=num/10;
        }

        return reversed;
    }
}
