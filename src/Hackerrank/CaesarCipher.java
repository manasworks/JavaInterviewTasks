package Hackerrank;

public class CaesarCipher {
    public static void main(String[] args) {
        String s = "okffng-Qwvb"; //okffng-Qwvb
        int n = 26;

        System.out.println(caesarCipher(s, n));
    }

    public static String caesarCipher(String s, int k) {
        // Write your code here
        int shift = k%26;
        if (shift==0) return s;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>=97 && s.charAt(i)<=122){
                if (s.charAt(i) + shift > 122){
                    result.append( (char) ( ( (s.charAt(i)+shift) - 122) + 96 )   );
                } else{
                    result.append( (char) (s.charAt(i)+shift) );
                }
            } else if (s.charAt(i)>=65 && s.charAt(i)<=90){
                if (s.charAt(i) + shift > 90){
                    result.append( (char) ( ( (s.charAt(i)+shift) - 90) + 64 )   );
                } else{
                    result.append( (char) (s.charAt(i)+shift) );
                }
            }else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
