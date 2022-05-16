package array;

public class posNegZero {
    public static void main(String[]args) {
            int[] a1 = {1,-2,-3,5};
            int[] a2 = {1,2,3,-5};
            int[] a3 = {1,2,0,-5};

            System.out.println( solution(a2) );
        }

        public static int solution(int[] arr){
            int c=0;
            for (int each : arr) {
                if (each==0) return 0;
                if (each<0) c++;
            }
            if (c%2!=0) return -1;
            return 1;
        }
    }

