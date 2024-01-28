package array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TwoSumTest {

    TwoSum t = new TwoSum();


    @Test
    public void test1() {


        int[] actual = t.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(actual));
        Assert.assertArrayEquals(new int[]{0,1}, actual);

    }

    @Test
    public void test2() {


        int[] actual = t.twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(actual));
        Assert.assertArrayEquals(new int[]{1,2}, actual);

    }

    @Test
    public void test3() {


        int[] actual = t.twoSum(new int[]{3,3}, 6);
        System.out.println(Arrays.toString(actual));
        Assert.assertArrayEquals(new int[]{0,1}, actual);

    }


}
