package array;


import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/subarray-sum-equals-k/description/

    Example 1:

    Input: nums = [1,1,1], k = 2
    Output: 2
    Example 2:

    Input: nums = [1,2,3], k = 3
    Output: 2

 */
public class LargestSubArrWithKSum {

    /*                                               i
        A0 A1 A2 A3 A4 A5...... .... ........................AN
        <-----------(CUMSUM - K)---------><-----K---->

        <-------------------------------------------->
                             CUMSUM

        WHEN AT i, IF I HAVE SEEN (CUMSUM - K) BEFORE,
        THAT MEANS WE HAVE THEN STARTING POINT OF K AS MAP.GET(CUMSUM-K) INDEX
                                ENDING POINT OF   k AS i
                                LENGTH OF THR ARRAY = END POINT - START POINT

        0       1       2       3       4       5       6       7   <- Index
        15      -2      2       -8      1       7       10      23  <- values
        15      13     {15}     7       8       15      25      48  <- cumSum

        |----------------|                                                     Note: we are not going to put { } value as we are interested in longest
            15      0
        ++++++++----------
        |----------------------------------------|

     */
    public int subarraySum(int[] nums, int k) {

        int maxLenSoFar = 0;

        int curCumSum = 0;

        Map<Integer, Integer> cumSumToIndex = new HashMap<>();

        int curIndex = 0;
        for (int num : nums) {

            curCumSum = curCumSum + num;

            //special case: where sub array is stating from beginning
            if (curCumSum == k) {
                maxLenSoFar = curIndex + 1;
                curIndex++;
                continue;
            }

            if (cumSumToIndex.containsKey(curCumSum - k)) {

                Integer index = cumSumToIndex.get(curCumSum - k);

                int len = curIndex - index;
                maxLenSoFar = Math.max(maxLenSoFar, len);
            } else {
                cumSumToIndex.put(curCumSum, curIndex);
            }
            curIndex++;

        }

        return maxLenSoFar;
    }
}
