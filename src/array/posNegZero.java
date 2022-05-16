package array;

public class posNegZero {
    public static void main(String[]args) {
            int[] a1 = {1,-2,-3,5};
            int[] a2 = {1,2,3,-5};
            int[] a3 = {1,2,0,-5};

            System.out.println( solution(a3) );
        }

        public static int solution(int[] arr){
            int sum=1;
            for (int each : arr) {
                sum*=each;
            }
            if (sum==30) return 1;
            if (sum==-30) return -1;
            return 0;
        }
    }

