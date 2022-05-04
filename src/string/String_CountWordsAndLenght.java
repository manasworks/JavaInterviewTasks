package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String_CountWordsAndLenght {
    public static void main(String[] args) {
        String str = "Yesterday I drove to San Diego and went surfing";

        System.out.println(count(str));
    }

    static String count(String s){
        String[] words = s.replaceAll("\\p{Punct}", "").toLowerCase().split("\\s+");
        int wordsCount = words.length;
        List<Integer> charsInWord = new ArrayList<>();
        for (String word : words) {
            charsInWord.add(word.length());
        }
        Collections.sort(charsInWord);
        return "wordcount: "+wordsCount+", wordsizes: "+charsInWord;
    }
}
