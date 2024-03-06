package array;

public class TwoSum2 {
    //https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
    /*
        Example 1:

        Input: numbers = [2,7,11,15], target = 9
        Output: [1,2]
        Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
        Example 2:

        Input: numbers = [2,3,4], target = 6
        Output: [1,3]
        Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
        Example 3:

        Input: numbers = [-1,0], target = -1
        Output: [1,2]
        Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].

     */
    public int[] twoSum(int[] nums, int target) {

        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        int[] targetPosition = new int[2];

        while (leftPointer < rightPointer) {
            if (nums[leftPointer] + nums[rightPointer] == target) {
                targetPosition[0] = leftPointer + 1;
                targetPosition[1] = rightPointer + 1;
                return targetPosition;
            }

            //As its sorted, if the summation is more than target, only if we decrease right,it will go towards
            //target.
            if (nums[leftPointer] + nums[rightPointer] > target) {
                rightPointer--;
            } else
                leftPointer++;
        }

        return targetPosition;
    }

}
