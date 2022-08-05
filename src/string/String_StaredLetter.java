package string;

public class String_StaredLetter {
    public static void main(String[] args) {
        String str = "*a*%=3=*";

        System.out.println( isLetterStarred(str) );
    }

    public static boolean isLetterStarred(String s){

        int len = s.length()-1;

        for (int i = 0; i < len; i++) {
            if (Character.isLetter(s.charAt(i))){
                if (i==0 && s.charAt(len)!='*') return false;
                if (i-1>0 && s.charAt(i-1)!='*') return false;
                if (i+1<len && s.charAt(i+1)!='*') return false;
            }
        }
        return true;
    }
}
/*
3. Create a function StarredLetters which takes a string and determine if it satisfies our requirements by
returning either “true” or “false”. For the string to be true each letter must be surrounded by a * symbol.
The string will not be empty and will have at least one letter.

Examples
Input    Output
a%=3=*    true
%3b%3    false
 */