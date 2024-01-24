package array;

import org.junit.Test;

public class SetMatrixZerosTest {
    SetMatrixZeros s = new SetMatrixZeros();

    @Test
    public void test1() {


        int[][] arr = new int[][]{
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };

        s.setZeroes(arr);
        s.printArr(arr);
    }


    @Test
    public void test2() {


        int[][] arr = new int[][]{
                {0, 1},

        };

        s.setZeroes(arr);
        s.printArr(arr);
    }


}
