package map;

import java.util.*;

public class Map_LongestSubstring {
    public static void main(String[] args) {
        String s1 =   "zabc";
        String s2 =   "yabc";

        System.out.println(longestCommonSubstring1( s1, s2));
        System.out.println(longestCommonSubstring2( s1, s2));
        System.out.println("["+longestCommonSubstring3( s1, s2)+"]");

    }

    public static String longestCommonSubstring1(String s1, String s2){
        String[] ar1 = s1.split("");
        String[] ar2 = s2.split("");
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (String each : ar1) map1.put(each, Collections.frequency(Arrays.asList(ar1), each));
        for (String each : ar2) map2.put(each, Collections.frequency(Arrays.asList(ar2), each));

        int max=0;
        String maxChar= "";
        for (Map.Entry<String, Integer> each1 : map1.entrySet()) {
            for (Map.Entry<String, Integer> each2 : map2.entrySet()) {
                if (each1.getKey().equals(each2.getKey()) && each1.getValue().equals(each2.getValue())){
                    if ( each1.getValue()>max) {
                        max = each1.getValue();
                        maxChar = each1.getKey();
                    }
                }
            }
        }
        String result="";
        for (int i = 0; i < max; i++) {
            result +=maxChar;
        }
        return result;
    }

     public static Set<String> longestCommonSubstring2(String s, String t){
        int[][] table = new int[s.length()][t.length()];
        int longest = 0;
        Set<String> result = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) != t.charAt(j)) {
                    continue;
                }

                table[i][j] = (i == 0 || j == 0) ? 1 : 1 + table[i - 1][j - 1];
                if (table[i][j] > longest) {
                    longest = table[i][j];
                    result.clear();
                }
                if (table[i][j] == longest) {
                    result.add(s.substring(i - longest + 1, i + 1));
                }
            }
        }
        return result;
    }

    public static String longestCommonSubstring3(String s1, String s2){

        String result="";
        int len1 = s1.length()-1;
        int len2 = s2.length()-1;

        for (int i = 0; i < s1.length(); i++) {
            String current="";

            for (int j = 0; j < s2.length(); j++) {

                if (s1.charAt(i)==s2.charAt(j) ){
                    while ( s1.charAt(i)==s2.charAt(j)  ){
                        if (i==len1 && j==len2) break;
                        current += s2.charAt(j);
                        i++;
                        j++;
                    }
                }
            }
            if (current.length()>result.length())result=current;
        }


        return result;
    }
}
/*

String s = "aaabbbcccccddddeeeeee";
We have 5 substrings of matching characters here
emu nujno naiti which one is the longest
His answer at the end should be "eeeeee"
 */
