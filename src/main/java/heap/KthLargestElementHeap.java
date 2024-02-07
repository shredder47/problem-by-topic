package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementHeap {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer > maxHeap = new PriorityQueue<>(nums.length, Collections.reverseOrder());

        for (int num : nums) {
            maxHeap.add(num);
        }

        int kthVal = 0;

        for (int i = 0; i<k ; i++){
            kthVal = maxHeap.poll();
        }
        return kthVal;
    }


}
