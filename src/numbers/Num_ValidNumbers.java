package numbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Num_ValidNumbers {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("d:/num.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println( phone(sc.nextLine()) );
    }

    public static String phone(String n){
        n = n.replaceAll("[^0-9]+", ""); // Cleaning the string leaving only numbers
        return "("+n.substring(0,3)+") "+n.substring(3, 6)+" "+n.substring(6); // Formatting the string
    }

}

