package array;

import java.util.*;

//https://leetcode.com/problems/4sum/description/

/*
        Example 1:
        Input: nums = [1,0,-1,0,-2,2], target = 0
        Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

        Example 2:
        Input: nums = [2,2,2,2,2], target = 8
        Output: [[2,2,2,2]]
 */

public class FourSum {

    //    Input: nums = [-2,-1,0,0,1,2], target = 0
    //    Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>> uniqueQuads = new HashSet<>();

        Arrays.sort(nums);

        int i = 0;

        while (i < nums.length - 3) {

            int currentNum = nums[i];
            int newTarget = target - currentNum;  // target = [x] + y -> target - x = y(newTarget)

            //Array index for three sum calculation
            int start = i + 1;
            int end = nums.length;


            List<List<Integer>> everyQuads = modifiedThreeSum(nums, start, end, newTarget, i);
            uniqueQuads.addAll(everyQuads);
            i++;
        }

        return new ArrayList<>(uniqueQuads);
    }

    public List<List<Integer>> modifiedThreeSum(int[] nums, int start, int end, int newTarget, int prevNum) {

        int length = end;

        int i = start;

        Set<List<Integer>> triplets = new HashSet<>();

        while (i < length) {

            int L = i + 1;
            int R = length - 1;

            while (L < R) {
                long sum = (long) nums[i] + (long) nums[L] + (long) nums[R];

                if (sum == newTarget) {
                    triplets.add(Arrays.asList(nums[prevNum], nums[i], nums[L], nums[R]));
                    L++;
                } else if (sum > newTarget)
                    R--;
                else
                    L++;
            }
            i++;
        }

        return new ArrayList<>(triplets);
    }

}
