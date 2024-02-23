package array;

import org.junit.Assert;
import org.junit.Test;

public class LargestSubArrWithKSumTest {


    LargestSubArrWithKSum z = new LargestSubArrWithKSum();

    @Test
    public void test1() {
                            //15  13  15  7  8  15 25  48
        int[] arr = new int[]{15, -2, 2, -8, 1, 7, 10, 23};
        Assert.assertEquals(5,z.subarraySum(arr,8));

    }

    @Test
    public void test2() {
        int[] arr = new int[]{1,1,1};
        Assert.assertEquals(2,z.subarraySum(arr,2));

    }

    @Test
    public void test3() {
        int[] arr = new int[]{1,2,3};
        Assert.assertEquals(2,z.subarraySum(arr,3));
    }
    @Test
    public void test4() {
        int[] arr = new int[]{1,2,1,2,1};
        Assert.assertEquals(3,z.subarraySum(arr,3));
    }

}
