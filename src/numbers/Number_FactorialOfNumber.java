package numbers;

public class Number_FactorialOfNumber {
    public static void main(String[] args) {

        int num = 5;

        System.out.println( factorial(num) );

        System.out.println( factorial2(num) );
    }
    // Factorial of  number 5 is 5*4*3*2*1=120

    // Factorial with recursion
    static int factorial(int n){
        if (n==1) return 1;
        return n*factorial(n-1);
    }

    // Factorial with loop
    static int factorial2(int n){
        if (n==1) return 1;
        int res=1;
        for (int i = 1; i <= n; i++) {
            res*=i;
        }
        return res;
    }
}
