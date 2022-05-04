package tasks;

public class test7 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {


            String result="";
            if (i%5==0) result+="Rocks";
            if (i%3==0) result+="Rocks";
            System.out.println(result);
        }
    }

}
