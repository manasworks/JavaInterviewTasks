package tasks;

public class test11 {

    int res=0;
    public test11(int first, int second) {
        res=first*second;
    }

    public static void main(String... arrrrgs) {
        test11 result;
        result = new test11(5,5);
        System.out.println(result.res);



    }
}
