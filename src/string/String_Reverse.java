package string;


public class String_Reverse {
    public static void main(String[] args) {
        String str = "String_Reverse";
        System.out.println(reverse1(str));
        System.out.println(reverse2(str));
    }

    static String reverse1(String str){
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length/2; i++) {
            char temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return String.valueOf(arr);
    }

    static String reverse2(String str){
        StringBuilder result = new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
