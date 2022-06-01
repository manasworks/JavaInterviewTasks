package array;

public class Array_PresentNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9, 9};

        System.out.println(solution(arr, 5));
    }

    public static int solution(int[] a, int x) {
        int n = a.length;
        if (n == 0) {
            return -1;
        }
        int l = 0;
        int r = n - 1;
        while (l <= r) {  // HERE
            int m = (l + r) / 2;
            if (a[m] >= x) { // HERE
                r = m - 1;
            } else {
                l = m + 1; // HERE
            }
        }
        if (a[l] == x) {
            return l;
        }
        return -1;
    }

}
