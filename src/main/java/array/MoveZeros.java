package array;

public class MoveZeros {

//https://leetcode.com/problems/move-zeroes

//    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//    Note that you must do this in-place without making a copy of the array.
//
//    Example 1:
//
//    Input: nums = [0,1,0,3,12] -
//    Output: [1,3,12,0,0]
//    Example 2:
//
//    Input: nums = [0]
//    Output: [0]


    public void moveZeroes(int[] nums) {

        int partitionValue = 0;
        int k = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == partitionValue) {
                continue;
            } else {
                k++;
                swap(nums, i, k);
            }
        }
    }

    private void swap(int[] nums, int position1, int position2) {

        int temp = nums[position1];
        nums[position1] = nums[position2];
        nums[position2] = temp;
    }
}
