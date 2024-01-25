package array;

import org.junit.Test;

import java.util.Arrays;

public class MergeIntervalTest {

    MergeIntervals m = new MergeIntervals();

    @Test
    public void test1() {


        int[][] arr = new int[][]{
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };

        System.out.println(Arrays.deepToString(m.merge(arr)));

    }

    @Test
    public void test2() {

        int[][] arr = new int[][]{
                {1,4},
                {4,5}
        };

        System.out.println(Arrays.deepToString(m.merge(arr)));
    }

    @Test
    public void test3() {

        int[][] arr = new int[][]{
                {1,4},
                {0,4},
                {2,4},
                {3,5},
        };

        System.out.println(Arrays.deepToString(m.merge(arr)));
    }

    @Test
    public void test4() {

        int[][] arr = new int[][]{
                {1,4},
                {0,1}
        };

        System.out.println(Arrays.deepToString(m.merge(arr)));
    }

    @Test
    public void test5() {

        int[][] arr = new int[][]{
                {1,4},
                {0,0}
        };

        System.out.println(Arrays.deepToString(m.merge(arr)));
    }
}
