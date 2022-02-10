package numbers;

public class Number_DivideWithoutDivision {
    public static void main(String[] args) {

     double quotient = divide(20, 5);
        System.out.println("quotient = " + quotient);

    }

    public static double divide(int a, int b){
        int count = 0;
        for (int i = a; i >= 0; i=a-b) {
            a-=b;
          count++;
        }
        return count;
    }
}
