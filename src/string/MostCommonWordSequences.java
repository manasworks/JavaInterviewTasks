package string;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class MostCommonWordSequences {
    public static void main(String[] args) {
        List<String> bookList = new ArrayList<>();

        Scanner s =new Scanner(System.in);
        System.out.println("==============================================================================");
        System.out.println("Enter books txt file path. Exp: C:/book.txt. To stop entering books type: DONE");
        System.out.println("==============================================================================");
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

        System.out.println(commonThree(bookList));

    }

    static List<String> commonThree(List<String> list) {

        Map<String, Integer> map = new HashMap<>();


        for (String each : list) {

            StringBuilder book = fileRead(each);
            String inputString = book.toString();

            String[] words = inputString.replaceAll("^[\\pL\\pN]+$", "").toLowerCase().split("\\s+"); //\p{Punct}

            for (int i = 2; i < words.length; i++) {

                if (map.containsKey(words[i - 2] + " " + words[i - 1] + " " + words[i])) {
                    map.put(words[i - 2] + " " + words[i - 1] + " " + words[i], map.get(words[i - 2] + " " + words[i - 1] + " " + words[i])+1);
                } else {
                    map.put(words[i - 2] + " " + words[i - 1] + " " + words[i], 1);
                }

            }
        }

        LinkedHashMap<String, Integer> sorted = map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (e1, e2) -> null, LinkedHashMap::new));

        List<String> result= new ArrayList<>();

        int c=0;
        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            c++;
            result.add(entry.getValue()+" - "+entry.getKey());
            if (c==100) break;
        }
        System.out.println(result.size());

        return result;
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
