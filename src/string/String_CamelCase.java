package string;

import java.util.Arrays;

public class String_CamelCase {
    public static void main(String[] args) {
        String str1 = "BOB loves-coding";
        String str2 = "cats AND*Dogs-are Awesome";
        String str3 = "a b c d-e-f%g";

        System.out.println(CamelCase(str1));
        System.out.println(CamelCase(str2));
        System.out.println(CamelCase(str3));
    }

    static String CamelCase(String s){
        String[] words = s.replaceAll("\\p{Punct}", " ").toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();
        result.append(words[0]);
        for (int i = 1; i < words.length; i++) {
            result.append(words[i].substring(0,1).toUpperCase()).append(words[i].substring(1));
        }
        return result.toString();
    }

}
