package string;

public class String_occurancesOfPlusMinus {
    public static void main(String[] args) {
        String S = "plusminusminusplusminus";
        System.out.println(solution(S));
    }

    static String solution(String s){
        s = s.toLowerCase().replaceAll("plus", "+");
        s = s.replaceAll("minus", "-");
        return s;
    }
}
