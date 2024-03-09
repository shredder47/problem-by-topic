package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumCommonValueTest {

    MinimumCommonValue m = new MinimumCommonValue();

    @Test
    public void getCommon1() {

       int[] nums1 = {1,2,3}, nums2 = {2,4};

        Assert.assertEquals(2,m.getCommon(nums1,nums2));
    }

    @Test
    public void getCommon2() {

        int[] nums1 = {2,4}, nums2 = {1,2};

        Assert.assertEquals(2,m.getCommon(nums1,nums2));
    }
}