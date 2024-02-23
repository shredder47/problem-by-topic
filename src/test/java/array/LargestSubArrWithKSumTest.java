package array;

import org.junit.Assert;
import org.junit.Test;

public class LargestSubArrWithKSumTest {


    LargestSubArrWith0Sum z = new LargestSubArrWith0Sum();

    @Test
    public void test1() {

        int[] arr = new int[]{15, -2, 2, -8, 1, 7, 10, 23};

        Assert.assertEquals(5, z.maxLen(arr, arr.length));

    }

    @Test
    public void test2() {
                            //10  25  20  35   25  30
        int[] arr = new int[]{10, 15, -5, 15, -10, 5};

        Assert.assertEquals(3, z.maxLen(arr, arr.length));

    }

    @Test
    public void test101() {

        int[] arr = new int[]{-1,1,-1,1};

        Assert.assertEquals(4, z.maxLen(arr, arr.length));

    }

}
