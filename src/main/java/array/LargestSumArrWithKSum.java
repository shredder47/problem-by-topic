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

Case 1, where we will use hashmap to get sum = 0
target = 0
        0       1       2       3       4       5       6       7   <- Index
        15      -2      2       -8      1       7       10      23  <- values
        15      13      15      7       8       15      25      48  <- cumSum

        |----------------|
            15      0
        ++++++++----------
        |----------------------------------------|


 Case 2, where we easily get the length:
 target= 20

 Idx=               0       1       2       3       4       5
 values=           10      15      -5      15     -10       5
 cumSum=           10      25     [20]     35      25     [20]

 */
public class LargestSumArrWithKSum {

    int maxLen(int[] A, int n,int target) {
        // Your code here
        HashMap<Integer, Integer> cumSumToIndex = new HashMap<>();

        int maxLength = 0;
        int cumSum = 0;

        for (int i = 0; i < n; i++) {

            cumSum += A[i];

            if (cumSum == target) {
                maxLength = i + 1; // current pointer + 1(as arr starts from 0)
            } else {
                if (cumSumToIndex.get(cumSum-target) != null) {
                    // Index after which the numbers are summing up to target
                    int idx = cumSumToIndex.get((cumSum-target));

                    //Number of digits forming the required target
                    int numDigits = i - idx;

                    //Store Max number of digits required/ length
                    maxLength = Math.max(maxLength,numDigits);
                } else {
                    //if current cumulative sum - target value doesn't exist. i.e no digits sum are there that when subtracted
                    //it will give the target.
                    cumSumToIndex.put(cumSum, i);
                }
            }
        }
        return maxLength;
    }

}
