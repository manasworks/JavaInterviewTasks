package array;

public class Array_SumOfLeftEqualToRight {
    public static void main(String[] args) {

        int[] arr = {6, 4, 4, 6,5, 6,7,2,3};
        sumOfLeftEqualToRight(arr);
    }

    public static void sumOfLeftEqualToRight(int[] arr) {
        boolean equalResult=false;
        int countRight = 0;
        int countLeft = 0;

            for (int i = 0; i < arr.length / 2; i++) {//creating first loop and counting up from right side to half of arr length
                countLeft += arr[i];
            }
        // int j = arr.length / 2;
        for (int k = arr.length - 1; k >arr.length/2; k--) {//second loop, counting up from the end of length to half of arr
                countRight += arr[k];
            }
            if (countLeft == countRight) {//if sum of right side equal to left side 
                equalResult = true;
            } else {
                equalResult = false;
        }
        System.out.println(countLeft+" "+countRight+" \n "+equalResult);

        }
    }

