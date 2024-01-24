package array;

//https://leetcode.com/problems/maximum-subarray/description/
public class MaximumSumSubArray {


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
