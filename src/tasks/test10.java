package tasks;

public class test10 {
    public static void main(String[] args) {
        String s = "school";

        System.out.println( firstRepetitive(s) );
    }

    static char firstRepetitive(String s){
        for (int i = 0; i < s.length(); i++) {
            int c=0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i)==s.charAt(j)) c++;
            }
            if (c>1) return s.charAt(i);
        }
        System.out.print("No repetitive chars found");
        return '!';
    }
}
