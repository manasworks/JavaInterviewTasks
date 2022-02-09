package array;

public class Array_FirstUniqueElement {
    public static void main(String[] args) {

        int[] arr = {0,5,6,9,7,2,-5,2,2-99,22,0};
        for (int each : arr) {//using for each loop for taking each element from Array
            int count=0; //represent the frequency of the ch
            for (int each2 : arr) {//using second for each loop, for comparing
                if (each == each2) {
                    count++;//counting all unique elements from Array
                }
            }
            if(count==1){//if frequency of elements is one, then the element is unique
                System.out.print(each+" ");
                break;//using break executing, because we need only first unique element
            }
        }

    }
}
//Q3 write a program that can find the first duplicated element from the array