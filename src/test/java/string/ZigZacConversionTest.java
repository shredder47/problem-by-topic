package string;

import org.junit.Assert;
import org.junit.Test;
import string.ZigZacConversion;

public class ZigZacConversionTest {
    ZigZacConversion s = new ZigZacConversion();

    @Test
    public void test1() {
        String input = "PAYPALISHIRING";
        String convert = s.convert(input, 3);
        Assert.assertEquals("PAHNAPLSIIGYIR",convert);
    }

    @Test
    public void test2() {
        String input = "PAYPALISHIRING";
        String convert = s.convert(input, 4);
        Assert.assertEquals("PINALSIGYAHRPI",convert);
    }

    @Test
    public void test3() {
        String input = "AB";
        String convert = s.convert(input, 1);
        Assert.assertEquals("AB",convert);
    }

}
