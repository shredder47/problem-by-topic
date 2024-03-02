package array;

import org.junit.Assert;
import org.junit.Test;

public class SquiresOfSortedArrayTest {

    SquiresOfSortedArray s = new SquiresOfSortedArray();
    @Test
    public void sortedSquares1() {

        int[] ints = {-4, -1, 0, 3, 10};


        Assert.assertArrayEquals(new int[]{0, 1, 9, 16, 100}, s.sortedSquares(ints));
    }

    @Test
    public void sortedSquares2() {

        int[] ints = {-7, -3, 2, 3, 11};

        Assert.assertArrayEquals(new int[]{4, 9, 9, 49, 121}, s.sortedSquares(ints));
    }
}