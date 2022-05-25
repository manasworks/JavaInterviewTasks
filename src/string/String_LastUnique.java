package string;

public class String_LastUnique {
    public static void main(String[] args) {
        String str="Last unique";

        System.out.println( lastUnique(str) );
    }

    public static String lastUnique(String s){

        for (int i = s.length()-1; i >= 0 ; i--) {
            char  ch = s.charAt(i);
            if (s.indexOf(ch) == s.lastIndexOf(ch) && ch!=' '){
                return "Last unique is: "+ch;
            }
        }
        return "No unique chars is present";
    }
}
