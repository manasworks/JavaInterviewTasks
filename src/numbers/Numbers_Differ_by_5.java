package numbers;

public class Numbers_Differ_by_5 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {-1, 7, 5};

        System.out.println( findMatch(a1, a2) );

    }

    static int findMatch(int[] ar1, int[] ar2){
        // If number from first array minus number from second array has difference
        // of 5 or less and numbers are not equal. Count is +1 then.
        // Math.abs - Here to make sure we get absolute value all the time. Order doesn't matter if we 1-100 or 100-1;

        int count=0;
        for (int i = 0; i < ar1.length; i++) {
            if ( Math.abs(ar1[i]-ar2[i])<=5 && ar1[i]!=ar2[i]) count++;
        }
        return count;
    }
}
/*
Write a function and find a match that takes two arguments  A and B which are arrays with the same number of numbers.
Consider each element in A and its corresponding element in B. The function returns the count of the number of
times that the two numbers differ by 5 or less but are not equal to each other -please consider edge cases when
providing the answer.


findMatch([1, 2, 3], [100, 4, 200]) = 1

findMatch([1, 2, 3], [100, 4, 3]) = 1

findMatch([1, 2, 3], [-1, 7, 5]) = 3
 */

// 99, 2, 187
// 19.8, 0,  37