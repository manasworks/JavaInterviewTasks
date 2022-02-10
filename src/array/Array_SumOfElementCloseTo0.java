package array;

public class Array_SumOfElementCloseTo0 {
    public static void main(String[] args) {

        int arr[] = {1, 60, -10, 70, -80, 85};
        // Expected output: The two elements whose sum is minimum are -80 and 85
        sumOfTwoClosestToZero(arr);
    }


    public static void sumOfTwoClosestToZero(int[] arr){
        /*
        To find out which sum of the two elements is closest to zero we need nested loops. Outer loop will take one value
        and sum them up with every element in inner loop. Then we need 3 new variable to hold two current values and one min
        to compare if it's the sum is smaller than current sum. Also, to prevent sum of same element in array we will
        compare indexes if it's same index we will skip that.
         */
        int value1=0, value2=0; // Variables to hold first and second elements
        int min=Integer.MAX_VALUE; // Min value to compare if the sum of two actually smaller than this. Default is max number possible

        for (int i = 0; i < arr.length; i++) { // Our first loop to assign Value 1
            int temp=0; // Variable to hold sum of two elements
            for (int j = 0; j < arr.length; j++) { // Inner loop ti assign Value 2
                if (i==j){ // Check if indexes are same. To prevent sum up of same element
                    continue; // If yes skip
                } else { // If NO go and do the magic
                    temp=arr[i]+arr[j]; // Sum of two elements
                    temp=Math.abs(temp); // Absolute value of elements. if we get -5 absolute will be just 5.
                    if (temp<min){ // Check if current sum is smaller than my min value
                        min=temp; // If yes my min now equals to current sum
                        value1=arr[i]; // And first value was this
                        value2=arr[j]; // And second was that
                    }
                }
            }
        }
        // Print out result
        System.out.println("The sum of "+value1+" and "+value2+" is closest to Zero and make "+min);
    }

}
/*  return the sum of the two elements closest to zero
11	If there are two elements equally close to zero like -2 and 2,
    consider the positive element t o be "closer" to zero than the negative one.
 */