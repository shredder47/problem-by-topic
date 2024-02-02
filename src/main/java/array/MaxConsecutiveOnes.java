package array;

public class MaxConsecutiveOnes {

    //    https://leetcode.com/problems/max-consecutive-ones/
//    Input: nums = [1,1,0,1,1,1]
//    Output: 3
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxOne = 0;
        int i = 0;
        int numOnesSoFar = 0;

        while (i < nums.length) {

            if (nums[i] == 1) {
                numOnesSoFar++;

                maxOne = Math.max(maxOne, numOnesSoFar);
            } else {
                numOnesSoFar = 0;
            }

            i++;

        }

        return maxOne;
    }

}
