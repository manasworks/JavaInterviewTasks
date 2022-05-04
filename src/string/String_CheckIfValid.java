package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class String_CheckIfValid {
    public static void main(String[] args) {
        String str = "[aa{(sdsd)aa}";  // [{()}], [(){}], (]})

        System.out.println( stringValidation(str) );
        System.out.println( isValid(str));
    }

    static boolean stringValidation(String str){

        str=str.replaceAll("[^(){}\\[\\]]", "");

        if (str.length()%2!=0) return false;

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c=='[' || c=='{' || c=='(') list.add(c);
            else if (list.size()==0) return false;
            else if (c==']' || list.get(list.size()-1)=='[') list.remove(list.size()-1);
            else if (c=='}' || list.get(list.size()-1)=='{') list.remove(list.size()-1);
            else if (c==')' || list.get(list.size()-1)=='(') list.remove(list.size()-1);
        }

        return list.size()==0;
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (stack.size() == 0 ||
                    c == ')' && stack.pop() != '(' ||
                    c == '}' && stack.pop() != '{' ||
                    c == ']' && stack.pop() != '[') {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
