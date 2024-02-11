package string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstUniqueCharInStringTest {

    FirstUniqueCharInString f = new FirstUniqueCharInString();
    @Test
    public void firstUniqChar1() {

        Assert.assertEquals(2,f.firstUniqChar("loveleetcode"));

    }

    @Test
    public void firstUniqChar2() {

        Assert.assertEquals(0,f.firstUniqChar("leetcode"));

    }

    @Test
    public void firstUniqChar3() {

        Assert.assertEquals(-1,f.firstUniqChar("aabb"));

    }
}