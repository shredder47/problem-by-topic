package array;


import java.util.HashMap;

/*
https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1

Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5

Explanation: The largest sub-array with
sum 0 will be  -2 2 -8 1 7.

        0       1       2       3       4       5       6       7   <- Index
        15      -2      2       -8      1       7       10      23  <- values
        15      13     {15}     7       8       15      25      48  <- cumSum

        |----------------|                                                     Note: we are not going to put { } value as we are interested in longest
            15      0
        ++++++++----------
        |----------------------------------------|

        0        1        2       3 <- Index
        -1       1       -1       1 <- values
        -1      [0]      -1      [0] <- cumSum
                                  |_________________________>  NATURALLY SUMMED TO 0, hence longest = 4
 */
public class LargestSubArrWith0Sum {

    int maxLen(int[] A, int n) {
        // Your code here
        HashMap<Integer, Integer> cumSumToIndex = new HashMap<>();

        int maxLengthSoFar = 0;
        int currentCumulutiveSum = 0;

        for (int i = 0; i < n; i++) {

            currentCumulutiveSum += A[i];

            if (currentCumulutiveSum == 0) {
                maxLengthSoFar = i + 1;

            } else {
                // have we seen this currentCumSum before?
                if (cumSumToIndex.containsKey(currentCumulutiveSum)) {
                    //That means where it has seen before till now elements are adding no value hence same sum came up
                    //therefore, those elements sum is zero

                    //get the index of where it was seen last
                    Integer index = cumSumToIndex.get(currentCumulutiveSum);
                    int len = i - index;
                    maxLengthSoFar = Math.max(maxLengthSoFar, len);

                } else {
                    cumSumToIndex.put(currentCumulutiveSum, i);
                }
            }


        }
        return maxLengthSoFar;
    }
}
