package string;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class MostCommonWordSequences {
    public static void main(String[] args) {
        List<String> bookList = new ArrayList<>();

        Scanner s =new Scanner(System.in);
        System.out.println("Enter books txt file path. Exp: C:/book.txt. To stop entering books type: DONE");
        String path="";
        int i=1;
        while (!path.equalsIgnoreCase("done")){
            System.out.print(i++ + " Book path: ");
            path = s.next();
            if (!path.equalsIgnoreCase("done")){
                bookList.add(path);
            }
        }
        s.close();

        System.out.println("bookList = " + bookList);

        StringBuilder book = fileRead("D:/pg2009.txt");

        System.out.println(commonThreeWords(book));

    }

    static Map commonThreeWords(StringBuilder s) {

        ArrayList<String> sequences = new ArrayList<>();

        String inputString = s.toString();

        String[] words = inputString.replaceAll("\\p{Punct}", "").toLowerCase().split("\\s+");

        for (int i = 2; i < words.length; i++) {
            sequences.add(words[i - 2] + " " + words[i - 1] + " " + words[i]);
        }
        
        Map<String, Long> map = new HashMap<>();

        for (String sequence : sequences) {
            if (map.containsKey(sequence)) {
                map.put(sequence, map.get(sequence)+1);
            } else {
                map.put(sequence, 1L);
            }
        }

        List<Map.Entry<String, Long>> list = new LinkedList<>(map.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()) == 0 ? o2.getKey().compareTo(o1.getKey()) : o2.getValue().compareTo(o1.getValue()));
        return list.stream().limit(100).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));
    }

    static StringBuilder fileRead(String filePath) {

        StringBuilder str = new StringBuilder();
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();
            while (line != null) {
                str.append(line);
                str.append(System.lineSeparator());
                line = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

}
