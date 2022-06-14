package string;

public class String_NextLetter {
    public static void main(String[] args) {
        String str = "£7eBmyuyu666";
        System.out.println(str);
        System.out.println(nextLetter(str));
    }

    public static String nextLetter(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                int base = (ch < 'a') ? 'A' : 'a';
                int rem = (ch - base + 2) % 26;
                ch = (char) (base + rem);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ch = (char) (ch - 'a' + 'A');
                }
            }
            result.append(ch);
        }
        return result.toString();
    }
}
/*
2.    Create a function NextLetter which takes a string parameter and modifies it using the following algorithm:
Replace every letter in the string with the letter next but one in the alphabet (c becomes e, z becomes b,
A becomes C). Ignore numbers and symbols. Then capitalize every vowel in this new string (a, e, i, o, u)
and finally return this modified string. The string will not be empty and not include spaces.

Examples
Input    Output
£7eBm    £7gDO
 */