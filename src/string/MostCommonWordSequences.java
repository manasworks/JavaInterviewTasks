package string;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class MostCommonWordSequences {
    public static void main(String[] args) throws IOException {

        StringBuilder sb;
        BufferedReader br = new BufferedReader(new FileReader("D:\\Book.txt"));
        try {
            sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        } finally {
            br.close();
        }

        System.out.println(commonThreeWords(sb));

    }

    static Map commonThreeWords(StringBuilder str){
        ArrayList<String> sequences = new ArrayList<>();
        String inputString = str.toString();
        // Removing punctuation
        String[] words = inputString.replaceAll("\\p{Punct}", "").toLowerCase().split("\\s+");
        // Creating sequence of 3 words
        for (int i = 3; i < words.length; i++) sequences.add(words[i-2]+" "+words[i-1]+" "+words[i]);
        System.out.println("sequences.size() = " + sequences.size());
        // Counting occurrence of each sequence in whole list
        Map<String, Long> seqMap = sequences.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        // Sorting and limiting by 100
        List<Map.Entry<String, Long>> list = new LinkedList<>(seqMap.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()) == 0
                ? o2.getKey().compareTo(o1.getKey())
                : o2.getValue().compareTo(o1.getValue()));
        return list.stream().limit(100).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));
    }
}
