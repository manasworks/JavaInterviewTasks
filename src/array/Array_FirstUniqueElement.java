package array;

public class Array_FirstUniqueElement {
    public static void main(String[] args) {

        int[] arr = {0, 5, 6, 9, 7, 2, -5, 2, 2 - 99, 22, 0};
        int frequency = 0;
        for (int i = 0; i < arr.length; i++) {

            int element = arr[i];

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == element) {
                    frequency++;
                } if (frequency >1) {
                    System.out.println(element);
            }


            }
        }
    }
}



//Q3 write a program that can find the first duplicated element from the array