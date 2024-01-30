package array;

import org.junit.Assert;
import org.junit.Test;

public class LargestSubArrWithEqual1And0Test {


    LargestSubArrWithEqual1And0 z = new LargestSubArrWithEqual1And0();

    @Test
    public void test1() {

        int[] arr = new int[]{1,1,0,1,1,0,0};

        Assert.assertEquals(6, z.maxLen(arr, arr.length));

    }



}
