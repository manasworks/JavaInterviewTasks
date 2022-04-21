package array;

public class Arrays_ClosestToGivenN {
    public static void main(String[] a) {
        System.out.println(findClosest(new int[] {1,2,8,4,2,1,3,2,3,9,4,2}, 6));
    }
    private static int findClosest(int[] numbers, int key) {
        int closest=Integer.MAX_VALUE;
        int result=0;
        for (int each : numbers) {
            if (Math.abs(each-key)<closest){
                closest = Math.abs(each-key);
                result=each;
            }
        }
        return result;
    }
}
