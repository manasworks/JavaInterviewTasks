package string;

public class String_PassWordValidation {
    public static void main(String[] args) {
        String pass = "turkey90AAA=";

        System.out.println( SimplePassword( pass ));
    }
    /*

     */

    public static String SimplePassword(String String){
        boolean hasCapital=false;
        boolean hasNumber=false;
        boolean hasSymbol=false;
        boolean notPassword=!String.toLowerCase().contains("password");
        boolean hasLenght=String.length()>7 && String.length()<31;

        for (int i = 0; i < String.length(); i++) {
            if (Character.isUpperCase(String.charAt(i))) hasCapital =true;
            if (Character.isDigit(String.charAt(i))) hasNumber=true;
            if (!Character.isLetterOrDigit(String.charAt(i))) hasSymbol=true;
        }

        String result = (hasCapital&&hasNumber&&hasSymbol&&notPassword&&hasLenght)?"true":"false";
        return result;
    }
}
