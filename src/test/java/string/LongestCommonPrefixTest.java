package string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    LongestCommonPrefix l = new LongestCommonPrefix();

    @Test
    public void longestCommonPrefix1() {

        String[] strs = new String[]{"flower", "flow", "flight"};
        String output = "fl";


        Assert.assertEquals(output, l.longestCommonPrefix(strs));
    }

    @Test
    public void longestCommonPrefix2() {

        String[] strs = new String[]{"dog", "racecar", "car"};
        String output = "";


        Assert.assertEquals(output, l.longestCommonPrefix(strs));
    }

    @Test
    public void longestCommonPrefix3() {

        String[] strs = new String[]{"dog", "d"};
        String output = "d";


        Assert.assertEquals(output, l.longestCommonPrefix(strs));
    }

    @Test
    public void longestCommonPrefix4() {

        String[] strs = new String[]{"", "d"};
        String output = "";


        Assert.assertEquals(output, l.longestCommonPrefix(strs));
    }

    @Test
    public void longestCommonPrefix5() {

        String[] strs = new String[]{"d", ""};
        String output = "";


        Assert.assertEquals(output, l.longestCommonPrefix(strs));
    }

    @Test
    public void longestCommonPrefix6() {

        String[] strs = new String[]{"doggo", "dogo"};
        String output = "dog";


        Assert.assertEquals(output, l.longestCommonPrefix(strs));
    }
}