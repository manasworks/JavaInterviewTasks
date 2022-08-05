package tasks;

public class fsdfs {
    public static void main(String[] args) {
        String  s="thereare500mangoes on30 trees in 5 gardens ";
        int sum=0;
        String letter="";
        String digit="";
        String sign="";
        for (int i = 0; i < s.length(); i++) {
            char letter1=s.charAt(i);
            if (Character.isDigit(letter1)){
                sum+=Integer.parseInt(letter1+"");
                digit+=letter1;

            } else if (Character.isLetter(letter1)) {
                letter+=letter1+" ";

            }else {
                sign+=letter1+" ";
            }

        }
        System.out.println(sum);
    }
}
