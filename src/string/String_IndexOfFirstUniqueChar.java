/*
Given a string, find the first non-repeating character in it and return its index.
If it doesn't exist, return -1.
 */
package string;

public class String_IndexOfFirstUniqueChar {
    public static void main(String[] args) {
        String str="DDDAAZCCCCCCB";
        int indexOfFirstUnique = indexOfFirstUnique(str);
        System.out.println("indexOfFirstUnique = " + indexOfFirstUnique);
    }

    public static int indexOfFirstUnique(String s){
        int index=-1;

        for (int i = 0; i < s.length(); i++) {
            int count=0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i)==s.charAt(j)) count++;
            }
            if (count==1) {
                return i;
            }
        }

        return index;
    }
}