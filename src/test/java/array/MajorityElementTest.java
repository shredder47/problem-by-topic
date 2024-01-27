package array;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTest {

    @Test
    public void test1() {

        MajorityElement s = new MajorityElement();

        Assert.assertEquals(3,s.majorityElement(new int[]{3,2,3}));
        Assert.assertEquals(2,s.majorityElement(new int[]{2,2,1,1,1,2,2}));

    }




}
