package tasks;

public class Artans {
    public static void main(String[] args) {
        String str = "abracadabra";

        System.out.println( solution(str));

        System.out.println( firstNonRepeatedChar(str) );
    }

    public static String solution(String str){
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                return ch+"";
            }
        }
        return "No unique found";
    }

    public static char firstNonRepeatedChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                return str.charAt(i);
            }

        }

        return ' ';

    }
}

