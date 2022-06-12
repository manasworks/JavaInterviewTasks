package tasks;

public class ArstanTask2 {

    // Gemini
    public static void main(String[] args) {

        int num = 14739538;
        solution(num);

        System.out.println();

        String str = "abcdtmnop";
        String str2 = "abcdmnop";

        functions(str);
        functions(str2);
    }
    // Function to reverse string divided by its middle
    public static void functions(String s){
        int len = s.length();
        String part1="";
        String part2="";
        if (len%2==0) {
            part1 = new StringBuilder(s.substring(0, len/2)).reverse().toString();
            part2 = new StringBuilder(s.substring(len/2)).reverse().toString();
            System.out.println(part1+part2);
        }
        else {
            part1 = new StringBuilder(s.substring(0, len/2)).reverse().toString();
            part2 = new StringBuilder(s.substring(len/2+1)).reverse().toString();
            System.out.println(part1+s.charAt(len/2)+part2);
        }
    }

    // If digit in number is odd an smaller than next digit print it out
    public static void solution(int n){
        StringBuilder res = new StringBuilder();
        int current=0, prev=0;
        while (n>0){
            current = n%10;
            if (current<prev && current%2!=0) res.insert(0, current);
            prev=current;
            n/=10;
        }
        System.out.println(res);
    }
}
