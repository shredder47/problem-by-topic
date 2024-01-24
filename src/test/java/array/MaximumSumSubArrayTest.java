package array;

import org.junit.Assert;
import org.junit.Test;

//https://leetcode.com/problems/maximum-subarray/
public class MaximumSumSubArrayTest {
    MaximumSumSubArray s = new MaximumSumSubArray();

    @Test
    public void test1() {

        int [] arr = new int[] {-2,1,-3,4,-1,2,1,-5,4};

        Assert.assertEquals(6,s.maxSubArray(arr));
    }

    @Test
    public void test2() {


        int [] arr = new int[] {-2};

        Assert.assertEquals(-2,s.maxSubArray(arr)); // imp test, if max check is not done before resetting sum to zero, it will not pass this case
    }




}
