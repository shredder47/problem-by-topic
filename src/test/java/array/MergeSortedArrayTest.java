package array;

import org.junit.Test;

import java.util.Arrays;

public class MergeSortedArrayTest {

    MergeSortedArray m = new MergeSortedArray();

    @Test
    public void test1() {

        int[] arr1  = new int[] {0};
        int[] arr2  = new int[] {1};

        m.merge(arr1,0,arr2,1);
        System.out.println(Arrays.toString(arr1));

    }

    @Test
    public void test2() {

        int[] arr1  = new int[] {1};
        int[] arr2  = new int[] {};

        m.merge(arr1,1,arr2,0);
        System.out.println(Arrays.toString(arr1));

    }
    @Test
    public void test3() {

        int[] arr1  = new int[] {1,2,3,0,0,0};
        int[] arr2  = new int[] {2,5,6};

        m.merge(arr1,3,arr2,3);
        System.out.println(Arrays.toString(arr1));

    }

    @Test
    public void test4() {

        int[] arr1  = new int[] {4,5,6,0,0,0};
        int[] arr2  = new int[] {1,2,3};

        m.merge(arr1,3,arr2,3);
        System.out.println(Arrays.toString(arr1));

    }

}