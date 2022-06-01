package string;

public class String_PrintTree {
    public static void main(String[] args) {
        int treeHeight = 19;

        for (int i = 0; i < treeHeight; i++) {
            for (int j = treeHeight - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int s = 0; s <= i * 2; s++) {
                System.out.print("*");
            }
            System.out.println();
        }




        int starSize = 5;
        for (int i = 0; i < starSize; i++) {
            for (int j = 0; j < starSize; j++) {
                if (j == i || j == starSize - 1 - i) {
                    System.out.print(" * ");
                } else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
