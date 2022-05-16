package tasks;

public class test2222 {
    public static void main(String[] args) {
        int n=528;

        System.out.println( reverseNum(n));
    }

    static int reverseNum(int n){
        int num=0;

        while (n>0){

            num=num * 10 + n%10;
            n/=10;

        }
        return num;

    }
}
