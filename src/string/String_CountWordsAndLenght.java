package string;

import java.util.*;
import java.util.stream.Collectors;

public class String_CountWordsAndLenght {
    public static void main(String[] args) {
        String str = "Manas Max Kalenov\n" +
                "Software Development Engineer in Test\n" +
                "Dallas, TX | m.max.kalenov@gmail.com | +1 (323) 675 5428 | Green Card Holder\n" +
                "\n" +
                "Creative, efficiency, and result-driven Software Development Engineer (SDET) in Test with 5+ years of experience within Agile Scrum and Waterfall environments in both manual and automated Quality Assurance processes of Web and Client-Server applications. With 10+ years of experience as a UI/UX Designer. Which I believe gives me the exceptional experience to be a high-quality Test Automation Engineer with a different perspective and understanding of software testing.\n" +
                "\n" +
                "PROFESSIONAL SUMMARY\n" +
                "\n" +
                "•\tSolid knowledge of Object Oriented Programming (OOP) and 4+ years of experience in Java programming language for test automation purposes.\n" +
                "•\tWidely experienced in creation and maintenance of reusable automation scripts for Regression, Smoke, Functional, UI, API, Back End and User Acceptance testing suites.\n" +
                "•\tProficiency in Bug Life Cycle, Logging Defect, Bug Tracking, Retesting Bug and Closing Bug using Jira.\n" +
                "•\tExtended expertise in framework building and maintenance via Maven build management tools through implementation of Page Object Model (POM) and Singleton design patterns along with Selenium WebDriver for testing Client Server and Web based applications.\n" +
                "•\tWorking experience in Data Driven and Behavior Driven Development frameworks writing Cucumber Features, Scenarios, and Step Definitions on Gherkin.\n" +
                "•\tFirm understanding and implementation of JUnit and TestNG testing frameworks to organize and run test methods.\n" +
                "•\tExpertise in using Selenium WebDriver to execute parallel tests on multiple browsers, namely Chrome, Firefox & Safari.\n" +
                "•\tStrong knowledge of establishing connections and manipulating data using SQL Relational Database types to perform Database Testing.\n" +
                "•\tProficient in creating automation script from scratch and experienced in Postman and API Web Services testing using REST Assured.\n" +
                "\n" +
                "RELEVANT SKILLS\n" +
                "\n" +
                "Framework\tData Driven, Behavioral Driven, Hybrid Framework\n" +
                "Automation Tools\tSelenium WebDriver, Cucumber, Rest Assured, JDBC\n" +
                "Defect Tracking Tool\tJIRA\n" +
                "Database and other Tools\tOracle SQL, My SQL, API  with Postman, SQL Developer, Jenkins, Git\n" +
                "Programming Languages\tJava, SQL, HTML, CSS, Gherkin\n" +
                "Build Management\tMaven\n" +
                "Methodologies\tAgile/Scrum, Waterfall, SDLC, STLC, BLC\n" +
                "Testing Methods\tFunctional, Regression, Ad-Hoc, Integration\n" +
                "\n" +
                "\n" +
                "WORK EXPERIENCE\n" +
                "\n" +
                "Company: ManyGroup – Dallas, TX\t\t\t\t\t\t\tSeptember 2018 - Present\n" +
                "Role: Test Automation Engineer \n" +
                "Responsibilities:\n" +
                "•\tImplemented Automated execution of tests using Maven build tool, also Integrated with Continuous Integration tool Jenkins for running tests on nightly basis on demand.\n" +
                "•\tBuilt BDD Automation Framework using Selenium Web Driver, Java language, Cucumber and JUnit for application UI testing. \n" +
                "•\tRetrieved all the Dynamic data from Database using SQL Queries for automation purpose and maintained static data in Excel sheets.\n" +
                "•\tExperience in implementing and maintaining Page Object Model (POM) by adding web elements at the page level and reusing the same elements.\n" +
                "•\tInvolved in Web services testing using REST-Assured by writing code to send request and validate response XML/JSON using Postman.\n" +
                "•\tAutomated the functional scenarios and built the Automation Regression Suite to run on demand. \n" +
                "•\tParticipated in a full life cycle of an Agile project and applied best Quality Assurance practices to ensure full functional testing of new features being added every sprint, as well as full Regression testing for all previously implemented functionalities in every sprint. \n" +
                "•\tParticipated in all the Scrum Ceremonies like Sprint Grooming, Sprint Planning, Daily Scrum, Sprit Demo, Sprint Retro meetings. \n" +
                "•\tPrimary duties included Smoke, Integration, Regression and Functional, to include execution, defect tracking and reporting.\n" +
                "\n" +
                "Company: Forever Living Products – Bishkek, Kyrgyzstan   \t\t\t\tAugust 2013 – May 2018\n" +
                "Role: UI/UX Designer / Manual Tester \n" +
                "Responsibilities:\n" +
                "•\tInvolved in designing Test Plans and writing and executing Manual test cases to test the system. \n" +
                "•\tPrioritized Manual test cases based upon the Business Requirements.  \n" +
                "•\tPerformed Ad-hoc (Random), Functional, Regression, Integration and Compatibility Testing of Web-based Application. \n" +
                "•\tWorked on functionalities that supports users from multiple locations, multi-lingual users, supports multiple service sectors\n" +
                "•\tPerformed UX/UI Design, Visual Design, Information Architecture and Project Management functions \n" +
                "•\tEffectively communicated design processes, ideas, and solutions to business stakeholders, product, marketing, and engineering teams, collaborating and iterating in accordance with research, feedback, or scope and implementation challenges.\n" +
                "•\tParticipated in mentoring sessions.\n" +
                "\n" +
                "\n" +
                "Company: Molbulak Micro Finances – Bishkek, Kyrgyzstan   \t\t\tMarch 2010 – August 2013\n" +
                "Role: UI/UX Designer \n" +
                "Responsibilities:\n" +
                "•\tPerformed UX/UI Design, Visual Design, Information Architecture and Project Management functions \n" +
                "•\tConducted user research, developed personas, created low and high-fidelity prototypes, wireframes, screen-flow diagrams, pattern libraries, UX documentation. Designed UX/UI for responsive web and native mobile applications. \n" +
                "\n";

        System.out.println(freq(str));
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

    static Map freq(String s){

        List<String> keywords = new ArrayList<>(Arrays.asList("SDET", "QA", "Java", "Selenium WebDriver", "JUnit", "Maven",
                "Cucumber", "Gherkin", "SQL", "JDBC", "TestNG", "POSTMAN", "REST Assured Library", "API Web Services testing",
                "API Testing", "REST Assured with Java", "Rest Assured API", "Behavioral Driven Development", "BDD",
                "Page Object Model", "POM", "Web and Client-Server software applications", "Web-based applications",
                "Functional and Automation Testing", "Database Testing", "Jira", "Git", "GitHub", "Jenkins", "HTML", "CSS",
                "Mobile Testing", "Apium", "IntelliJ/Eclipse", "Oracle Database", "Object-Oriented Programming", "OOP",
                "Test Scenarios", "Test Cases", "Functional Testing", "Regression Testing", "Smoke Testing", "Positive and Negative Testing",
                "Software Development Life Cycle", "SDLC", "Software Test Life Cycle", "STLC", "Defect Life Cycle", "BLC",
                "Agile/Scrum", "Waterfall", "Sprint Planning Meeting", "Daily Standup meeting", "Sprint Review Meeting",
                "Sprint Retrospective", "Sprint Demos", "Extent-Reports", "HTML reports", "Cucumber JSON reports"));

        Map<String, Integer> map = new HashMap<>();
        String[] words = s.replaceAll("\\p{Punct}", "").split("\\s+");

        for (String word : words) {
            if(map.containsKey(word)) {
                map.put(word, map.get(word)+1);
            } else {
                map.put(word, 1);
            }
        }

        LinkedHashMap<String, Integer> sorted = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (e1, e2) -> null, LinkedHashMap::new));


        return sorted;


    }
}
