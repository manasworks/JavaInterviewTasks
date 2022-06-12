package tasks;

import java.util.Arrays;

public class Olga_CamelCase {
    public static void main(String[] args) {

        //String str = "the-stealth-warrior__TEST---SA";
        String str = "The_stealth_Warrior";

        System.out.println( toCamelCase(str) );
    }

    public static String toCamelCase(String s){

        String[] words = s.replaceAll("-","_").split("_");
        StringBuilder result = new StringBuilder();
        boolean isFirstWord = true;

        for (String word : words) {
            if (word.isEmpty() || word.isBlank()) continue;
            if (isFirstWord && !Character.isUpperCase(word.charAt(0))){
                result.append(word.toLowerCase());
                isFirstWord = false;
            } else {
                result.append(word.substring(0,1).toUpperCase()).append(word.substring(1).toLowerCase());
                isFirstWord = false;
            }
        }
        return result.toString();
    }
}
