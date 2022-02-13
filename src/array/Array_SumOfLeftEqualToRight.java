package array;

public class Array_SumOfLeftEqualToRight {
    public static void main(String[] args) {

        int[] arr = {7, 4, 4, 5, 6,7,2};
        sumOfLeftEqualToRight(arr);
    }

    public static void sumOfLeftEqualToRight(int[] arr) {
        boolean equalResult=false;
        int countRight = 0;
        int countLeft = 0;

            for (int i = 0; i < arr.length / 2; i++) {
                countLeft += arr[i];
            }
            int j = arr.length / 2;
            for (int k = arr.length - 1; k > j; k--) {
                countRight += arr[k];
            }
            if (countLeft == countRight) {
                equalResult = true;
            } else {
                equalResult = false;
        }
        System.out.println(countLeft+" "+countRight+" \n "+equalResult);

        }
    }

