package greedy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindPolyWithLargestPerimeterTest {

    FindPolyWithLargestPerimeter f = new FindPolyWithLargestPerimeter();
    @Test
    public void largestPerimeter1() {

        int [] nums = new int[] {5,5,5};
        Assert.assertEquals(15,f.largestPerimeter(nums));

    }

    @Test
    public void largestPerimeter2() {

        int [] nums = new int[] {1,12,1,2,5,50,3};
        Assert.assertEquals(12,f.largestPerimeter(nums));

    }

    @Test
    public void largestPerimeter3() {

        int [] nums = new int[] {5,5,50};
        Assert.assertEquals(-1,f.largestPerimeter(nums));

    }
}