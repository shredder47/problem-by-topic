package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IncreasingTripletTest {

    IncreasingTriplet i = new IncreasingTriplet();

    @Test
    public void increasingTriplet1() {
        Assert.assertTrue(i.increasingTriplet(new int[]{1,2,3,4,5}));
    }

    @Test
    public void increasingTriplet2() {
        Assert.assertFalse(i.increasingTriplet(new int[]{5,4,3,2,1}));
    }

    @Test
    public void increasingTriplet3() {
        Assert.assertTrue(i.increasingTriplet(new int[]{2,1,5,0,4,6}));
    }

    @Test
    public void increasingTriplet4() {
        Assert.assertTrue(i.increasingTriplet(new int[]{20,100,10,12,5,13}));
    }
}