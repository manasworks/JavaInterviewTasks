package array;

import java.util.Arrays;

public class Array_AddUpTwo {
    public static void main(String[] args) {
        String[] str1 = {"mo", "da", "sis", "bro"};
        String[] str2 = {"m", "d", "ter"};

        String[] result = new String[Math.max(str1.length, str2.length)];

        if (str1.length >= str2.length) {
            for (int i = 0; i < result.length; i++) {
                if (i < str2.length) result[i] = str1[i] + str2[i];
                else result[i] = str1[i];
            }
        } else {
            for (int i = 0; i < result.length; i++) {
                if (i < str1.length) result[i] = str1[i] + str2[i];
                else result[i] = str2[i];
            }
        }
        System.out.println(Arrays.toString(result));


    }
}
