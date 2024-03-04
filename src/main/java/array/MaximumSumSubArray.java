package array;

//https://leetcode.com/problems/maximum-subarray/description/

/*

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

 */


// Use Kandens Algo for this
public class MaximumSumSubArray {

    //Kadane's ALgo
    //{-2,1,-3,4,-1,2,1,-5,4}
    public int maxSubArray(int[] nums) {

        int maxValueSoFar = Integer.MIN_VALUE;
        int currentSum = 0;

        // Iterate the arr
        for (int num : nums) {

            currentSum = currentSum + num;

            // set max at each pass
            maxValueSoFar = Math.max(maxValueSoFar, currentSum);

            // if the current sum is going negative, reset the search
            if (currentSum < 0)
                currentSum = 0;
        }

        return maxValueSoFar;
    }
}
