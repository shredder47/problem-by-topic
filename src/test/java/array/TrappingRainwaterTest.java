package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrappingRainwaterTest {

    TrappingRainwater t = new TrappingRainwater();

    @Test
    public void trap1() {

        int[] height = new int[]{3, 1, 2, 4, 0, 1, 3, 2};

        Assert.assertEquals(8,t.trap(height));

    }

    @Test
    public void trap2() {

        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        Assert.assertEquals(6,t.trap(height));

    }
}