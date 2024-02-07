package heap;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TopKFrequentElementTest {


    TopKFrequentElement t = new TopKFrequentElement();
    @Test
    public void topKFrequent() {

        int[] n = new int[]{1,1,1,2,2,3};
        int k = 2;
        Assert.assertArrayEquals(new int[]{1,2},t.topKFrequent(n, k));
        System.out.println(Arrays.toString(t.topKFrequent(n, k)));
    }

    @Test
    public void topKFrequent2() {

        int[] n = new int[]{1};
        int k = 1;
        Assert.assertArrayEquals(new int[]{1},t.topKFrequent(n, k));
        System.out.println(Arrays.toString(t.topKFrequent(n, k)));
    }

    @Test
    public void topKFrequent3() {

        int[] n = new int[]{1,2};
        int k = 2;
        Assert.assertArrayEquals(new int[]{1,2},t.topKFrequent(n, k));
        System.out.println(Arrays.toString(t.topKFrequent(n, k)));
    }
}