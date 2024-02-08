package heap;

import java.util.Collections;
import java.util.PriorityQueue;

//https://leetcode.com/problems/find-median-from-data-stream/
public class MedianOfDataStream {

    /*
        Input
        ["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"]
        [[], [1], [2], [], [3], []]

        Output
        [null, null, null, 1.5, null, 2.0]
     */

    private PriorityQueue<Integer> minHeapR;
    private PriorityQueue<Integer> maxHeapL;

    public MedianOfDataStream() {
        minHeapR = new PriorityQueue<>();
        maxHeapL = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {

        //If given num is less than leftHeap's max, include it there | else send it to right
        if (maxHeapL.isEmpty() || maxHeapL.peek() > num)
            maxHeapL.add(num);
        else
            minHeapR.add(num);

        //Every step check and balance the count on left vs right
        if (maxHeapL.size() - minHeapR.size() > 1)
            minHeapR.add(maxHeapL.poll());
        if (minHeapR.size() - maxHeapL.size() > 1)
            maxHeapL.add(minHeapR.poll());

    }

    public double findMedian() {

        //if event count then sum of both heap's peek / 2
        if ((maxHeapL.size() + minHeapR.size()) % 2 == 0) {
            return ((double) maxHeapL.peek() + (double) minHeapR.peek()) / 2d;
        } else {
            //if count is odd, return the peek of the heap having more value
            if (maxHeapL.size() > minHeapR.size())
                return maxHeapL.peek();
            else
                return minHeapR.peek();
        }
    }

}
