package array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class LongestConsecutiveSequenceTest {

    LongestConsecutiveSequence t = new LongestConsecutiveSequence();


    @Test
    public void test1() {

        int actual = t.longestConsecutive(new int[]{100,4,200,1,3,2});
        Assert.assertEquals(4,actual);

    }

    @Test
    public void test2() {

        int actual = t.longestConsecutive(new int[]{100,4,200,1,3,2,5,6,7,8});
        Assert.assertEquals(8,actual);

    }

    @Test
    public void test3() {

        int actual = t.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});
        Assert.assertEquals(9,actual);

    }



}
