package string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class ResumeKeywordCheck {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        System.out.println("==============================================================================");
        System.out.println("                Enter resume file path. Exp: C:/resume.docx.");
        System.out.println("==============================================================================");
        System.out.print("File path: ");
        String path=s.next();

        resumeCheck("d:/test.txt");

    }

    static void resumeCheck(String path){

        List<String> keywords = new ArrayList<>(Arrays.asList("SDET", "QA", "Java", "Selenium WebDriver", "JUnit", "Maven",
                "Cucumber", "Gherkin", "SQL", "JDBC", "TestNG", "Postman", "REST Assured Library", "API Web Services testing",
                "API Testing", "REST Assured with Java", "Rest Assured API", "Behavioral Driven Development", "BDD",
                "Page Object Model", "POM", "Web and Client-Server software applications", "Web-based applications",
                "Functional and Automation Testing", "Database Testing", "Jira", "Git", "GitHub", "Jenkins", "HTML", "CSS",
                "Mobile Testing", "Apium", "IntelliJ/Eclipse", "Oracle Database", "Object-Oriented Programming", "OOP",
                "Test Scenarios", "Test Cases", "Functional Testing", "Regression Testing", "Smoke Testing", "Positive and Negative Testing",
                "Software Development Life Cycle", "SDLC", "Software Test Life Cycle", "STLC", "Defect Life Cycle", "BLC",
                "Agile/Scrum", "Waterfall", "Sprint Planning Meeting", "Daily Standup Meeting", "Sprint Review Meeting",
                "Sprint Retrospective", "Sprint Demo", "Extent-Reports", "HTML reports", "Cucumber JSON reports"));

        StringBuilder resume = fileRead(path);

        Map<String, Integer> map = new HashMap<>();
        List<String> missingKeywords = new ArrayList<>();

        for (String keyword : keywords) {
            int count = 0, fromIndex = 0;
            while ((fromIndex = resume.indexOf(keyword, fromIndex)) != -1 ){
                count++;
                fromIndex++;
            }
            if (count>0) map.put(keyword, count);
            else missingKeywords.add(keyword);
        }

        LinkedHashMap<String, Integer> sorted = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (e1, e2) -> null, LinkedHashMap::new));

        System.out.print("Keywords found: ");
        System.out.println(sorted);


        System.out.print("\nMissing keywords:");
        System.err.println(missingKeywords);

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
