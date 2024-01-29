package array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LongestSubStringTest {

    LongestSubString t = new LongestSubString();


    @Test
    public void test1() {


        int c = t.lengthOfLongestSubstring("abcabcbb");
        System.out.println(c);
        Assert.assertEquals(3,c);

    }

    @Test
    public void test2() {


        int c = t.lengthOfLongestSubstring("bbbbb");
        System.out.println(c);
        Assert.assertEquals(1,c);
    }

    @Test
    public void test3() {


        int c = t.lengthOfLongestSubstring("pwwkew");
        System.out.println(c);
        Assert.assertEquals(3,c);
    }

    @Test
    public void test4() {


        int c = t.lengthOfLongestSubstring("aab");
        System.out.println(c);
        Assert.assertEquals(2,c);
    }

    @Test
    public void test5() {


        int c = t.lengthOfLongestSubstring("dvdf");
        System.out.println(c);
        Assert.assertEquals(3,c);
    }



}
