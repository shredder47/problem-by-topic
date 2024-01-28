package array;

import org.junit.Assert;
import org.junit.Test;

public class ReversePairsTest {

    ReversePairs r = new ReversePairs();

    @Test
    public void test1() {

        int[] arr = new int[]{1, 3, 2, 3, 1};

        Assert.assertEquals(2, r.reversePairs(arr));
    }

    @Test
    public void test2() {

        int[] arr = new int[]{2, 4, 3, 5, 1};

        Assert.assertEquals(3, r.reversePairs(arr));
    }
    @Test
    public void test3() {


        int[] arr = new int[]{2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};

        Assert.assertEquals(0, r.reversePairs(arr));
    }
}
