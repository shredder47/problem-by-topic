package array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
public class SortColorsTest {
    SortColors s = new SortColors();

    @Test
    public void test1() {

        int [] arr = new int[] {2,0,2,1,1,0};

        s.sortColors(arr);

        Assert.assertArrayEquals(Arrays.stream(( new int[] {2,0,2,1,1,0})).sorted().toArray(),arr);
    }
    @Test
    public void test2() {

        int [] arr = new int[] {1,2,0};

        s.sortColors(arr);

        Assert.assertArrayEquals(Arrays.stream(( new int[] {1,2,0})).sorted().toArray(),arr);
    }
    @Test
    public void test3() {

        int [] arr = new int[] {2,0,2};

        s.sortColors(arr);

        Assert.assertArrayEquals(Arrays.stream(( new int[] {2,0,2})).sorted().toArray(),arr);
    }








}
