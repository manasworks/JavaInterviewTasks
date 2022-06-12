package tasks;

public class Fibo {
    public int n;

    public Fibo(int n) {
        this.n = n;
    }

    public int[] fibonacciArray(){
        int[] fibArray = new int[n];
        fibArray[0]=1;
        fibArray[1]=1;
        for (int i = 2; i <n ; i++) {
            fibArray[i] = fibArray[i-1]+fibArray[i-2];
        }
        return fibArray;
    }
}
