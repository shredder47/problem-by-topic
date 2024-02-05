package array;

import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveOnesTest {

    MaxConsecutiveOnes m = new MaxConsecutiveOnes();

    @Test
    public void findMaxConsecutiveOnes() {

        int[] nums = new int[] { 1,1,0,1,1,1};
        Assert.assertEquals(3,m.findMaxConsecutiveOnes(nums));


    }
}