package stackandqueues;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NextGreaterElement1Test {

    NextGreaterElement1 n = new NextGreaterElement1();
    @Test
    public void nextGreaterElement1() {

        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};

        System.out.println(Arrays.toString(n.nextGreaterElement(nums1, nums2)));

    }

    @Test
    public void nextGreaterElement2() {

        int[] nums1 = new int[]{2,4};
        int[] nums2 = new int[]{1,2,3,4};

        System.out.println(Arrays.toString(n.nextGreaterElement(nums1, nums2)));

    }
    @Test
    public void nextGreaterElement3() {

        int[] nums1 = new int[]{1,3,5,2,4};
        int[] nums2 = new int[]{6,5,4,3,2,1,7};

        System.out.println(Arrays.toString(n.nextGreaterElement(nums1, nums2)));

    }
}