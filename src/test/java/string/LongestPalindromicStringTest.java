package string;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicStringTest {

    LongestPalindromicString l = new LongestPalindromicString();
    @Test
    public void longestPalindrome() {

        Assert.assertEquals("abba",l.longestPalindrome("ababba"));
        Assert.assertEquals("bb",l.longestPalindrome("cbbd"));
        Assert.assertEquals("c",l.longestPalindrome("cbd"));
        Assert.assertEquals("a",l.longestPalindrome("ac"));
        Assert.assertEquals("bbb",l.longestPalindrome("abbb"));
        Assert.assertEquals("abba",l.longestPalindrome("abbab"));

    }
}