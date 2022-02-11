package array;


import java.util.Arrays;

public class Array_Permutation {

    public static void main(String[] args) {

        char[] arr = {'B', 'D', 'A'};

        Arrays.sort(arr);//here we are calling from Java collections  Arrays sort method

        System.out.println(Arrays.toString(arr));

    }
}
// Given an array of 3 characters print all permutation combinations from the given characters