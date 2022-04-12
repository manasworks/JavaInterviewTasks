package array;

public class Test {
    public static void main(String[] args) {
        String[] provinces={"12", "ASS", "BBB"};
        String randomStr = provinces[ (int)(Math.random()*provinces.length) ];
        System.out.println(randomStr);
    }
}
