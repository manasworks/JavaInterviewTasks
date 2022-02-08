public class Question1_FindMaxNumber {
    public static void main(String[] args) {

        int[] arr = {0,5,6,9,7,2,-5,2,2-99,22,0};

        System.out.println("The max number is: "+findMax(arr));
    }

    public static int findMax(int[] arr){
        int maxNumber=arr[0];

        for (int each : arr) {
            if (each>maxNumber){
                maxNumber=each;
            }
        }

        return maxNumber;
    }
}
//Write a function that can find the maximum number from an int Array