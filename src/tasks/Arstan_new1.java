package tasks;

import javax.swing.text.MaskFormatter;

import java.text.ParseException;

import static java.lang.Long.parseLong;

public class Arstan_new1 {
    public static void main(String[] args) {

        String str = "1 (613)-9---@#jhjggfvv$!-9@#$5-0253";
       //System.out.println(phoneNumFormat("A:"+str));
        System.out.println(phoneFormat(str));
    }

    public static String phoneFormat(String str) {
        str = str.replaceAll("[^0-9]", "");
        if (str.length()!=10) return "Invalid Number";
        return new StringBuilder(str).insert(0,"+1").insert(2,"(").insert(6,")").insert(10,"-").toString();
    }

    public static String phoneNumFormat(String str) {

        str = str.replaceAll("\\p{Punct}", "").replaceAll(" ", "");
        String nums = "";
        for (char each : str.toCharArray()) {
            if (!Character.isLetter(each)) {
                nums += each;
            }
//                System.out.println("Number must be digit");
//                System.exit(0);}
        }
        if (nums.substring(0, 1) == 1 + "")
            nums = nums.substring(1);
        System.out.println("nums = " + nums);
        long number = parseLong(nums);
        if (nums.toCharArray().length == 10) {
            return "+1(" + (number + "").substring(0, 3) + ")" + (number + "").substring(3, 6) + "." + (number + "").substring(6);
        } else if (str.toCharArray()[0] == '1' && str.toCharArray().length == 11) {
            return "+" + 1 + "(" + (number + "").substring(1, 4) + ")" + (number + "").substring(4, 7) + "." + (number + "").substring(7);
        } else return "Invalid Number";

    }
}
/*
# Clean up user-entered phone numbers so that they can be sent SMS messages.
#
# The North American Numbering Plan (NANP) is a telephone numbering system used by many countries in North America
# like the United States, Canada or Bermuda. All NANP-countries share the same international country code: 1.
#
# NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan Area code, commonly known as area
# code, followed by a seven-digit local number. The first three digits of the local number represent the exchange
# code, followed by the unique four-digit number which is the subscriber number.

 */