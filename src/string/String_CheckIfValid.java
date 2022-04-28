package string;

import java.util.ArrayList;
import java.util.List;

public class String_CheckIfValid {
    public static void main(String[] args) {
        String str = "[!a!!@%%(asda@aa)asd{1@@23}ds(``sds)[1]]";  // [{()}], [(){}]

        System.out.println( stringValidation(str) );
    }

    static boolean stringValidation(String str){

        str=str.replaceAll("[^(){}\\[\\]]", "");

        if (str.length()%2!=0) return false;

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c=='[' || c=='{' || c=='(') list.add(c);
            else if (list.size()==0) return false;
            else if (c==']' && list.get(list.size()-1)=='[') list.remove(list.size()-1);
            else if (c=='}' && list.get(list.size()-1)=='{') list.remove(list.size()-1);
            else if (c==')' && list.get(list.size()-1)=='(') list.remove(list.size()-1);
        }

        return list.size()==0;
    }
}
