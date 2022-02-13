package array;

public class Array_FindMinimum {
    public static void main(String[] args) {

        int[] arr = {0,5,6,9,7,2,-5,2,2-99,22,0};
        int min=arr[0];
        for (int each : arr) {
            if(min>each){
                min=each;
            }
        }
        System.out.println(min);
    }
}
// Write a function that can find the minimum number from an int Array