package string;

import java.util.Arrays;

public class String_Reverse_Elvira {
    public static void main(String[] args) {
        String[] arrayOne = {"One", "Two", "Three", "Four", "Five"};
        String[] arrayTwo = {"Six", "Seven", "Eight", "Nine", "Ten"};

        System.out.println( Arrays.toString( reverse( arrayOne ) ));
        System.out.println( Arrays.toString( combibe(arrayOne, arrayTwo) ));

    }

    public static String[] reverse(String[] arr){
        String[] result = new String[arr.length];
        int l = 0;

        for (String each : arr) {

            // To char aarray
            char[] n = each.toLowerCase().toCharArray();

            // Reverse
            for (int i = 0; i < n.length/2; i++) {
                char temp = n[i];
                n[i] = n[ (n.length-1)-i ];
                n[(n.length-1)-i] = temp;
            }

            // Put it back
            result[l++] = new String(n);

        }
        return  result;
    }

    public static String[] combibe(String[] arr1, String[] arr2){
        int i=0;
        String[] result = new String[arr1.length + arr2.length];

        for (String each : arr1) {
            result[i++] = each;
        }

        for (String each : arr2) {
            result[i++] = each;
        }

        return result;
    }
}
