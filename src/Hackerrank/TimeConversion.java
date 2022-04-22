package Hackerrank;

public class TimeConversion {
    public static void main(String[] args) {
        String time = "12:05:45AM";
        System.out.println(timeConversion(time));
    }

    public static String timeConversion(String s) {
        int h = Integer.parseInt(s.substring(0,2));
        if (s.contains("PM") && h!=12) h+=12;
        return "";
    }
}
