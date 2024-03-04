package array;

//https://leetcode.com/problems/rotate-image/description/
public class RotateMatrix {

    public void rotate(int[][] matrix) {

        //n*n or squire
        int matrixDimension = matrix.length;

      /*      0 1 2                  0 1 2
          0  [1,2,3]             0  [7,4,1]
          1  [4,5,6]    -->      1  [8,5,2]
          2  [7,8,9]             2  [9,6,3]
       */

        int[][] newMatrix = new int[matrixDimension][matrixDimension];

        //copy pattern
        //00 -> 02
        //01 -> 12
        //02 -> 22

        //Copy elements to new Array using the pattern
        for (int row = 0; row < matrixDimension; row++) {

            for (int col = 0; col < matrixDimension; col++) {
                // Row changes, col remains constant
                int nRow = col;
                int nCol = (matrixDimension - 1) - row;
                newMatrix[nRow][nCol] = matrix[row][col];

            }
        }

        //mutate original array
        for (int row = 0; row < matrixDimension; row++) {

            for (int col = 0; col < matrixDimension; col++) {

                matrix[row][col] = newMatrix[row][col];
            }
        }

    }
}
