package heap;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedianOfDataStreamTest {

    MedianOfDataStream m = new MedianOfDataStream();

    @Test
    public void test() {

        m.addNum(1);
        m.addNum(2);
        m.addNum(3);
        m.addNum(4);
        m.addNum(5);
        Assert.assertEquals(3.0d, m.findMedian(),0.0);
        m.addNum(6);
        Assert.assertEquals(3.5d, m.findMedian(),0.5);

    }
}