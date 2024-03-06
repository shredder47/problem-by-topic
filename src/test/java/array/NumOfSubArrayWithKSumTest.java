package array;

import org.junit.Assert;
import org.junit.Test;

public class NumOfSubArrayWithKSumTest {


    NumOfSubArrayWithKSum z = new NumOfSubArrayWithKSum();

    @Test
    public void test1() {
                            //15  13  15  7  8  15 25  48
        int[] arr = new int[]{15, -2, 2, -8, 1, 7, 10, 23};
        Assert.assertEquals(2,z.subarraySum(arr,8));

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
        int[] arr = new int[]{1,2,1,2,1};  // 1 3 4 6 7
        Assert.assertEquals(4,z.subarraySum(arr,3));
    }

    @Test
    public void test5() {
        int[] arr = new int[]{1};
        Assert.assertEquals(0,z.subarraySum(arr,0));
        Assert.assertEquals(1,z.subarraySum(arr,1));
        Assert.assertEquals(0,z.subarraySum(arr,2));
    }

    @Test
    public void test6() {   // -1 , -2 , -1
        int[] arr = new int[]{-1,-1,1};
        Assert.assertEquals(1,z.subarraySum(arr,0));

    }

}
