package Hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
    public static void main(String[] args) {
        String time = "11:05:45AM";
        System.out.println(timeConversion(time));
    }

    public static String timeConversion(String s) {
        int hours = Integer.parseInt(s.substring(0,2));
        if (s.contains("AM")){
            if (hours==12) return "00"+s.substring(2,8);
            return s.substring(0,8);
        }
        else {
            if (hours==12) return "12"+s.substring(2,8);
            s=(hours+12)+s.substring(2,8);
        }
        return s;
    }
}
