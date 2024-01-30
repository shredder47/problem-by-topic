package array;

import org.junit.Test;

import java.util.Arrays;

public class RotateMatrixTest {

    RotateMatrix m = new RotateMatrix();

    @Test
    public void test1() {


        int[][] arr = new int[][]{
                {5,   1,  9,    11},
                {2,   4,  8,    10},
                {13 , 3,  6,    7 },
                {15, 14, 12,    16}
        };
        m.rotate(arr);
        /*
              [15, 13, 2,  5]
              [14, 3, 4,   1]
              [12, 6, 8,   9]
              [16, 7, 10, 11]
         */
        System.out.println(Arrays.deepToString(arr));


    }

}
