package array;

import org.junit.Assert;
import org.junit.Test;

public class MoveZerosTest {

    MoveZeros m = new MoveZeros();
    @Test
    public void moveZeroes() {
        int[] ints = {0, 1, 0, 3, 12};
        m.moveZeroes(ints);
        Assert.assertArrayEquals(new int[]{1,3,12,0,0},ints);
    }

    @Test
    public void moveZeroes2() {
        int[] ints = {73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0};
        m.moveZeroes(ints);
        Assert.assertArrayEquals(new int[]{73348, 66106, -85359, 53996, 18849, -6590, -53381, -86613, -41065, 83457, 0},ints);

    }
}