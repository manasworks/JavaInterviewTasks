package tasks;

public class Hulya1 {
    public static void main(String[] args) {
        int[] arr = {1,-2,-3,5};

        System.out.println( solution(arr) );
    }

    public static int solution(int[] arr){
        int m=1;
        for (int each : arr) {
            if (each==0) return 0;
            m*=each;
        }
        return (m>0)?1:-1;
    }
}
