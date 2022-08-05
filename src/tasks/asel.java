package tasks;

import java.util.Arrays;

public class asel {
    public static void main(String[] args) {
        String input1 = "1000thereare500mangoes on30 trees in 5 gardens ";

        System.out.println(sumOfAllNumbers(input1));

    }

    public static int sumOfAllNumbers(String str){
        int sum=0;
        String[] arr = str.replaceAll("[^0-9]", " ").split(" ");
        for (String each : arr) {
            if (each.isEmpty())  continue;
            sum += Integer.parseInt(each);
        }
        return sum;
    }

    public static int a (String str){
//need an container to hold the numbers
        String temp = "";
//another container for sum
        int total = 0;
//going to loop thru the string so I can check every char
        for (int i = 0; i < str.length(); i++) {
//if my char is digit I will add it to my string container
            if (Character.isDigit(str.charAt(i))){

                temp += str.charAt(i);
//not digit transform string in int and reset my string container
            }else{

                total += Integer.parseInt(temp);
                temp = "";
            }
        }
//total I have to add the string container just in case my last letters was numbers
        return total+Integer.parseInt(temp);

    }

    public static int indexOfFirstNonRepeatingChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                return i;
            }
        }
        return -1;
    }


}
/*
select * from Appointments A
left join Orders O on A.id = O.appt_id
where O.id is null
 */