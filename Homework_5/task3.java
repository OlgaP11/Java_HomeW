public class task3 {
    public static void main(String[] args) {
        int [] field [] = new int [8][8];
        solution(field, 0);
    }

    public static void showField(int [] matrix []) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean checkPosition (int [] matrix [], int row, int column) {
        boolean flag = true;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[row][i] == 1) {
                flag = false;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][column] == 1) {
                flag = false;
            }
        }

        for (int i = row, j = column; i >= 0 && j >= 0; i--, j--){
            if (matrix[i][j] == 1) {
                flag = false;
            }
        }

        for (int i = row, j = column; i >= 0 && j < matrix.length; i--, j++) {
            if (matrix[i][j] == 1) {
                flag = false;
            }
        }
        return flag;
    }

    public static void solution (int [] matrix [], int row) {
        if (row == matrix.length) {
            showField(matrix);
            return;
        }
        for (int i = 0; i < matrix.length; i++){
            if (checkPosition(matrix, row, i)== true){
                matrix[row][i] = 1;
                solution(matrix, row + 1);
                matrix[row][i] = 0;
            }
        }
    }


}
