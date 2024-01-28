package array;

import org.junit.Test;

import java.util.List;

public class FourSumTest {

    FourSum t = new FourSum();


    @Test
    public void test1() {


        List<List<Integer>> lists = t.fourSum(new int[]{1,0,-1,0,-2,2},0);
        System.out.println(lists); //[[-2, 0, 0, 2], [-2, -1, 1, 2], [-1, 0, 0, 1]]

    }
@Test
    public void test2() {


        List<List<Integer>> lists = t.fourSum(new int[]{2,2,2,2,2},8);
        System.out.println(lists); //[[2,2,2,2]]

    }

    @Test
    public void test3() {


        List<List<Integer>> lists = t.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000},-294967296);
        System.out.println(lists);

    }

}
