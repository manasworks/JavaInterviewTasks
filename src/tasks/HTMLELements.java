package tasks;

import java.util.*;

public class HTMLELements {
    public static void main (String[] args) {
        String str= "<div>abc</div><p><em><i>test test test</b></em></p>";
        System.out.println( HTMLElements(str));
    }
    public static String HTMLElements(String s) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            String tag="";
            if (s.charAt(i)=='<'){
                while (s.charAt(i)!='>'){
                    tag+=s.charAt(i);
                    i++;
                }
                tag+=s.charAt(i);
                list.add(tag);
            }
        }
        Stack<String> stack = new Stack<>();
        String result = "true";
        for (String e : list) {
            if (e.equals("<b>") || e.equals("<div>") || e.equals("<em>") || e.equals("<i>") || e.equals("<p>")){
                stack.push(e);
            } else if (stack.size()==0 ||
                    e.equals("</b>") && !stack.pop().equals("<b>") ||
                    e.equals("</div>") && !stack.pop().equals("<div>") ||
                    e.equals("</em>") && !stack.pop().equals("<em>") ||
                    e.equals("</i>") && !stack.pop().equals("<i>") ||
                    e.equals("</p>") && !stack.pop().equals("<p>")
            ){
                int index = list.indexOf(e);
                result = list.get(index-1).replaceAll("<","").replaceAll(">","").replaceAll("/","");
                return result;
            }
        }
        return result;
    }


}

