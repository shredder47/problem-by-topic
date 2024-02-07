package array;

import heap.KthLargestElementHeap;
import org.junit.Assert;
import org.junit.Test;

public class KthLargestElementTest {

    KthLargestElementQS k = new KthLargestElementQS();
    KthLargestElementHeap kh = new KthLargestElementHeap();
    @Test
    public void findKthLargest() {

        int[] arr2 = {3,2,1,5,6,4};

        Assert.assertEquals(5,k.findKthLargest(arr2, 2));
    }

    @Test
    public void findKthLargestHeap() {

        int[] arr2 = {3,2,1,5,6,4};

        Assert.assertEquals(5,kh.findKthLargest(arr2, 2));
    }
}