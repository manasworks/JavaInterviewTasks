package array;

public class Array_FindMaximum {
    public static void main(String[] args) {

        int[] arr = {0,5,6,9,7,2,-5,2,2-99,22,0};
        int maxNum = arr[0];

        for (int element : arr) {
            if(element > maxNum){
                maxNum = element;
            }
        }
        System.out.println(maxNum);
    }
}
//Write a function that can find the maximum number from an int Array