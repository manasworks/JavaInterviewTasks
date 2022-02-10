package array;

public class Array_SumOfLeftEqualToRight {
    public static void main(String[] args) {

        int[] arr = {4, 9, 1, 3, 6, 4};

        System.out.println(equalLeftRight(arr));

    }

    public static String equalLeftRight(int[] arr){
        /*
        To find element in array where left sum to it, and right sum to it are equal we need 3 nested loops.
        First outer loop will take element to check it's left and right sums.
        First inner loop will sum up all elements till the index of taken element in outer loop
        Second inner loop will sum up all elements from the element to the end of array
        And whenever we have left sum equals to right sum we will return selected element in outer loop.
        If there is no such case we will return No such element
         */

        for (int i = 0; i < arr.length; i++) { // First loop to select element to check it's left and right sum
            int leftSum=0; // Variable to store sum of left part
            int rightSum=0; // Variable to store sum of right part
            for (int j = 0; j < i; j++) { // Loop to sum up left part from start till selected elements index
                leftSum+=arr[j]; // Sum up all elements
            }
            for (int j = i+1; j < arr.length; j++) { // Loop to sum up right part, from next index of selected till the end
                rightSum+=arr[j]; // Sum up all elements
            }
            if (leftSum==rightSum){ // If sums of left and right parts are equal
                return ""+arr[i]; // If yes return current element
            }
        }
        return "No such element";  // Loop finishes with no equal parts
    }
}
//    Given an array of integers, write a function to return the item in the array,
//    where the sum of all items on its left is equal to the sum of the ones on the right.
//    For example :
//    Given [4, 9, 1, 3, 6, 4]
//    your function should give item 1, because 4+9 = 3+6+4