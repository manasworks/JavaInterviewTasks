package string;

public class String_OneLetterPalindrome {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String[] str = {"levvel", "rdacecar", "letter", "levtrel", "anncda"};

        for (String each : str) {
            //System.out.println(each + ": " + oneLetterPalindrome(each));
            System.out.println(each + ": " +  palindrome_skp_1_char(each.toCharArray()));
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }

    public static boolean oneLetterPalindrome(String str){
        for (int i = 0; i < str.length()-1; i++) {
            if (isPalindrome(str.substring(0,i+1) + str.substring(i+2))) return true;
            //if (isPalindrome(str.replaceFirst(str.charAt(i) + "", ""))) return true;
        }
        return false;
    }

    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    private static boolean palindrome_skp_1_char(char[] input) {
        if (input == null || input.length <= 2) return true;
        boolean skipped = false;
        int start = 0, end = input.length - 1;
        while (start < end) {
            if (input[start] != input[end]) {
                if (skipped) return false;
                skipped = true;
                if (input[start+1] == input[end]) start++;
                else if(input[start] == input[end-1]) end--;
                else return false;
            }
            else {
                start++;
                end--;
            }
        }
        return true;
    }

}
