package string;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void romanToInt() {
        RomanToInteger r = new RomanToInteger();

//        Assert.assertEquals(3,r.romanToInt("III"));
//        Assert.assertEquals(58,r.romanToInt("LVIII"));
        Assert.assertEquals(1994,r.romanToInt("MCMXCIV"));
    }
}