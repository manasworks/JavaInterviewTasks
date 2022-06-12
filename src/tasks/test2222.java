package tasks;

public class test2222 {
    public static void main(String[] args) {
        int n=528;

        System.out.println( reverseNum(n));


        String name = "is vowel";
        name = name.toLowerCase().replaceAll("[^aeiou]", "");
        boolean result = name.length()!=0;

        System.out.println(result);
    }

    static int reverseNum(int n){
        int num=0;

        while (n>0){

            num=num * 10 + n%10;
            n/=10;

        }
        return num;

    }

    // Check if array of integers is sequential
    public static boolean checkIfArrayInSequence(int[] arr){
        int c=1;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i-1]+1==arr[i]) c++;
        }
        return c==arr.length;
    }
}
