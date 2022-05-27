package tasks;

public class TEst1 {
    public static void main(String[] args) {
        try {
            badMethod();
            System.out.print("1");
        } catch (Exception e){
            System.out.print("2");
        } finally {
            System.out.print("3");
        }
        System.out.print("4");
    }

    public static void badMethod() {
        throw new RuntimeException();
    }
}

