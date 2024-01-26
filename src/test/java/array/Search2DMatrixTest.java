package array;

import org.junit.Assert;
import org.junit.Test;

public class Search2DMatrixTest {


    Search2DMatrix s = new Search2DMatrix();

    @Test
    public void test1() {


        int[][] arr = new int[][]{
                {1,  3,  5,   7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        Assert.assertFalse(s.searchMatrix(arr, 13));
        Assert.assertTrue(s.searchMatrix(arr, 3));
        Assert.assertTrue(s.searchMatrix(arr, 11));
        Assert.assertFalse(s.searchMatrix(arr, 100));

    }
}
