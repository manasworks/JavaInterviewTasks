package string;

public class String_RemoveSubstring {
    public static void main(String[] args) {
        String str = "fgasdghjasdjjjasd";
        String sub = "asd";

        System.out.println( removeSubstring(str, sub) );
    }

    public static String removeSubstring(String str, String s){
        return str.replaceAll("["+s+"]", "");
    }


}
