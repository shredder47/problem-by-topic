package array;

import org.junit.Assert;
import org.junit.Test;

public class LargestSumArrWithKSumTest {


    LargestSumArrWithKSum z = new LargestSumArrWithKSum();

    @Test
    public void test1() {

        int[] arr = new int[]{15, -2, 2, -8, 1, 7, 10, 23};

        Assert.assertEquals(5, z.maxLen(arr, arr.length,0));

    }

    @Test
    public void test2() {

        int[] arr = new int[]{10, 15, -5, 15, -10, 5};

        Assert.assertEquals(4, z.maxLen(arr, arr.length,5));

    }

    @Test
    public void test101() {

        int[] arr = new int[]{-1,1,-1,1};

        Assert.assertEquals(4, z.maxLen(arr, arr.length,0));

    }

}
