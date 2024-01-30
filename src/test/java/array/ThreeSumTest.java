package array;

import org.junit.Test;

import java.util.List;

public class ThreeSumTest {

    ThreeSum t = new ThreeSum();


    @Test
    public void test1() {


        List<List<Integer>> lists = t.threeSum(new int[]{-1, 0, 1, 2, -1, -4}); //-4 -1 -1 0 1 2
        System.out.println(lists); //[[-1, -1, 2], [-1, 0, 1], [-1, 0, 1]]



    }

    @Test
    public void test2() {


        List<List<Integer>> lists = t.threeSum(new int[]{0,1,1});
        System.out.println(lists);

    }

    @Test
    public void test3() {


        List<List<Integer>> lists = t.threeSum(new int[]{0,0,0});
        System.out.println(lists);

    }
    @Test
    public void test4() {


        List<List<Integer>> lists = t.threeSum(new int[]{0,0,0,0});
        System.out.println(lists);

    }

    @Test
    public void test5() {


        List<List<Integer>> lists = t.threeSum(new int[]{0,0,0});
        System.out.println(lists);

    }

    @Test
    public void test6() {


        List<List<Integer>> lists = t.threeSum(new int[]{-2,0,1,1,2}); // -2 0 1 1 2
        System.out.println(lists); //[[-2,0,2],[-2,1,1]]


    }



}
