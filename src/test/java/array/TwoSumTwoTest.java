package array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TwoSumTwoTest {

    TwoSum2 t = new TwoSum2();


    @Test
    public void test1() {


        int[] actual = t.twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(actual));
        Assert.assertArrayEquals(new int[]{1,2}, actual);

    }

    @Test
    public void test2() {


        int[] actual = t.twoSum(new int[]{2,3,4}, 6);
        System.out.println(Arrays.toString(actual));
        Assert.assertArrayEquals(new int[]{1,3}, actual);

    }

    @Test
    public void test3() {


        int[] actual = t.twoSum(new int[]{-1,0}, -1);
        System.out.println(Arrays.toString(actual));
        Assert.assertArrayEquals(new int[]{1,2}, actual);

    }


}
