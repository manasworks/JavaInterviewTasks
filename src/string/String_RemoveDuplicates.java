/*
Write function that can remove the duplicated values from String
        Ex: removeDup("AAABBBCCC") ==> ABC
 */
package string;

public class String_RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AAABBBCCC";

        System.out.println(str);
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str){
        String result="";
        // To remove duplicates will use contains method. If my result doesn't contain current char will add it.
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (!result.contains(""+ch)){ // "" here just to convert char to string
                result+=ch;
            }
        }
        return result;
    }
}