package array;

public class Array_FirstUniqueElement {
    public static void main(String[] args) {

        int[] arr = {0, 5, 6, 9, 7, 2, -5, 2, 2 - 99, 22, 0};


        for (int each : arr) {
            int frequency = 0;
            for (int element : arr) {
                if (element == each) {
                    frequency++;
                }

            }
            if (frequency == 2) {
                System.out.println(each);
                break;
            }
        }
    }
}




//Q3 write a program that can find the first duplicated element from the array