package array;

import org.junit.Assert;
import org.junit.Test;

public class CountInversionsTest {




    @Test
    public void test1() {

        long [] arr = new long[] {3 ,2, 1};

        Assert.assertEquals(3L,CountInversions.getInversions(arr,3));
    }

    @Test
    public void test2() {

        long [] arr = new long[] {2 ,5, 1, 3, 4};

        Assert.assertEquals(4L,CountInversions.getInversions(arr,5));
    }
}
