package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Asel_JavaTasks {
    public static void main(String[] args) {
        int num = 1234567;
        int count=0;
        num = Math.abs(num);
        while(num>0){
            num/=10; // num = num / 10
            count++;
        }

//        if (num>0){
//            while(num>0){
//                num/=10; // num = num / 10
//                count++;
//            }
//        } else if (num<0){
//            while(num<0){
//                num/=10; // num = num / 10
//                count++;
//            }
//        } else {
//            count=1;
//        }

        System.out.println("First: "+count);

        num = -1234567;
        int digits = String.valueOf(num).replaceAll("[^0-9]","").length();
        System.out.println("Number digits: "+digits);

        String numberString = "-123sadas45dfdf###!@!!//***d4545467";
        int stringDigits = numberString.replaceAll("[^0-9]","").length();
        System.out.println("String digits: "+stringDigits);






        //---------------------------------------

        List<String> list = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"));

        System.out.println("List: "+ list );

        // String join method
        String str1 = String.join(" ", list);
        System.out.println("String 1: " +str1);

        // String loop method
        StringBuilder str2 = new StringBuilder();
        String str3 = "";
        for (String each : list) {
            str2.append(each).append(" ");
            str3 += each+" ";
        }

        System.out.println("String 2: " + str2 );
        System.out.println("String 3: " + str3 );



        //---------------------------
    }
}
