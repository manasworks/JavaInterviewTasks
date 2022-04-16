package tasks;

import java.util.*;

public class Snake_FindPathsThrough {
    public static void main(String[] args) {
        char[][] straightBoard1 =
               {{'+', '+', '+', '0', '+', '0', '0'},
                {'0', '0', '0', '0', '0', '0', '0'},
                {'0', '0', '+', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '+', '0', '0'},
                {'+', '+', '+', '0', '0', '0', '+'}};

        char[][] straightBoard2 =
               {{'+', '+', '+', '0', '+', '0', '0'},
                {'0', '0', '0', '0', '0', '+', '0'},
                {'0', '0', '+', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '+', '0', '0'},
                {'+', '+', '+', '0', '0', '0', '+'}};

        char[][] straightBoard3 =
               {{'+', '+', '+', '0', '+', '0', '0'},
                {'0', '0', '0', '0', '0', '0', '0'},
                {'0', '0', '+', '+', '0', '+', '0'},
                {'0', '0', '0', '0', '+', '0', '0'},
                {'+', '+', '+', '0', '0', '0', '+'}};

        System.out.println("passableRowsColumns(straightBoard1) = " + passableRowsColumns(straightBoard1));
        System.out.println("passableRowsColumns(straightBoard2) = " + passableRowsColumns(straightBoard2));
        System.out.println("passableRowsColumns(straightBoard3) = " + passableRowsColumns(straightBoard3));

        ArrayList<ArrayList<Integer>> lists1 = findPassableLanes(straightBoard1);
        System.out.println("Rows: " + lists1.get(0) + ", Columns: " + lists1.get(1));
    }

    static Map<String, List<Integer>> passableRowsColumns(char[][] b){

        Map<String, List<Integer>> paths = new HashMap<>();

        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();

        for (int i = 0, m=0; i<b.length; i++, m++){
            String r = "";
            for (int j = 0; j<b[i].length; j++){
                r+= b[i][j];
            }
            if (!r.contains("+")) rows.add(i);
        }
        for (int j = 0; j < b[0].length; j++) {
            String c="";
            for (int i = 0; i < b.length; i++) {
                c+=b[i][j];
            }
            if (!c.contains("+")) columns.add(j);
        }
        paths.put("Col :", rows);
        paths.put("Row :", columns);
        return paths;
    }


    public static ArrayList<ArrayList<Integer>> findPassableLanes(char[][] matrix) {

        ArrayList<Integer> rowList = new ArrayList<>();
        ArrayList<Integer> columnList = new ArrayList<>();

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int row = 0; row < matrix.length - 1; row++) {
            if (matrix[row][0] == '0' && dfs(matrix, row, 0, 1)) {
                rowList.add(row);
            }
        }

        for (int column = 0; column < matrix[0].length - 1; column++) {
            if (matrix[0][column] == '0' && dfs(matrix, 0, column, 0)) {
                columnList.add(column);
            }
        }

        result.add(rowList);
        result.add(columnList);
        return result;
    }

    public static boolean dfs(char[][] matrix, int row, int column, int flag) {

        if (flag == 1 && column == matrix[0].length - 1 && matrix[row][matrix[0].length - 1] == '0') return true;

        if (flag == 0 && row == matrix.length - 1 && matrix[matrix.length - 1][column] == '0') return true;

        if (row < 0 || column < 0 || row > matrix.length - 1 || column > matrix.length || matrix[row][column] != '0')
            return false;

        boolean result;

        if (flag == 1) {
            result = dfs(matrix, row, column + 1, 1);
        } else {
            result = dfs(matrix, row + 1, column, 0);
        }

        return result;
    }
}
