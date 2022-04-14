package string;

public class String_Palindrome_replace {
    public static void main(String[] args) {
        String s = "??dfsdfsdfs???Fsdfsd?SDFS????";

        System.out.println(solution(s));
    }

    static String solution(String str){
        char[] arr = str.toCharArray();
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            if (arr[i]=='?' && arr[l-1-i]!='?') arr[i]=arr[l-1-i];
            if (arr[i]=='?' && arr[l-1-i]=='?') {
                arr[i]='z';
                arr[l-1-i]='z';
            }
        }
        String str1=String.valueOf(arr);
        String str2=new StringBuilder(str1).reverse().toString();
        return (str1.equals(str2))?str1:"NO";
    }
}
