package array;

public class Array_Stock {
    public static void main(String[] args) {
        int[] arr = {15,3,3,1,8,11,12,11,1};

        System.out.println( bestProfit(arr) );
    }

    public static int bestProfit(int[] arr){
        int best=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j>i ; j--) {
                if (arr[i]<arr[j] && arr[j]-arr[i]>best){
                    best = arr[i]=arr[j];
                }
            }
        }
        return best;
    }
}
