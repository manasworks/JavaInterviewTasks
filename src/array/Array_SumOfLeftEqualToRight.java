package array;

public class Array_SumOfLeftEqualToRight {
    public static void main(String[] args) {

        int[] arr = {7, 4, 4, 5, 6,7};
        sumOfLeftEqualToRight(arr);
    }

    public static void sumOfLeftEqualToRight(int[] arr) {
        int countRight = 0;
        int countLeft = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            countLeft += arr[i];}
            int j= arr.length/2;
            for (int k = arr.length-1; k > j ; k--) {
                countRight += arr[k];
            }
            System.out.println(countLeft+" "+countRight);

            /*for (int b = 0; b < arr.length; j++) {
                if (countLeft == countRight) {
                        break;
                }
                System.out.println(arr[b]);

            }

             */



        }
    }

