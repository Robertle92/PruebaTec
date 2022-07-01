import java.util.Arrays;

public class ejercicio1 {

    static int[][] transpose(int[][] matrix){
        int[][] result = new int[matrix[0].length][matrix.length];
        int row, column;

        for (column = 0 ; column < matrix[0].length ; column++){
            for (row = 0 ; row < matrix.length ; row++){
                result[column][row] = matrix[row][column];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [][] matrixA = {{3,4,5},{9,8,7},{2,5,7}};
        System.out.println("The B matrix is: " + Arrays.deepToString(transpose(matrixA)));
    }
}
