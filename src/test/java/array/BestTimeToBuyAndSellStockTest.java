package array;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock s = new BestTimeToBuyAndSellStock();

    @Test
    public void test1() {

        int [] arr = new int[] {7,1,5,3,6,4};

        Assert.assertEquals(5,s.maxProfit(arr));
    }

    @Test
    public void test2() {

        int [] arr = new int[] {7,6,4,3,1};

        Assert.assertEquals(0,s.maxProfit(arr));
    }

    @Test
    public void test3() {

        int [] arr = new int[] {2,4,1};

        Assert.assertEquals(2,s.maxProfit(arr)); // IMP
    }




}
