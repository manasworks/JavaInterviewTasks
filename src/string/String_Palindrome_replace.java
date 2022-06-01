package string;

public class String_Palindrome_replace {
    public static void main(String[] args) {
        String s1 = "?ab??a";
        String s2 = "bab??a";
        String s3 = "?a?";

        System.out.println(solution(s1));
        System.out.println(solution(s2));
        System.out.println(solution(s3));
    }

    static String solution(String str){
        char[] a = str.toCharArray();
        int l = a.length;
        for (int i = 0; i < l; i++) {
            if (a[i]=='?' && a[l-1-i]!='?') a[i]=a[l-1-i];
            if (a[i]=='?' && a[l-1-i]=='?') {
                a[i]='z';
                a[l-1-i]='z';
            }
        }
        String str1=String.valueOf(a);
        String str2=new StringBuilder(str1).reverse().toString();
        return (str1.equals(str2))?str1:"NO";
    }
}
