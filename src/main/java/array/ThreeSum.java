package array;

import java.util.*;

public class ThreeSum {

    // https://leetcode.com/problems/3sum/description/
    //                         i       L                 R
    //                         |       |                 |
    //   Input: nums = [-4  ,  -1  ,  -1  ,  0  ,  1  ,  2]


    //   Output: [[-1,-1,2],[-1,0,1]]
    //   Given an integer array nums, return all the triplets such that nums[i] + nums[j] + nums[k] == 0.

    /*
    Example 1:

    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
    Explanation:
    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
    The distinct triplets are [-1,0,1] and [-1,-1,2].
    Notice that the order of the output and the order of the triplets does not matter.
     */

    public List<List<Integer>> threeSum(int[] nums) {

        int length = nums.length;
        int target = 0;
        int i = 0;

        Arrays.sort(nums);

        //So No Duplicate Triplets Appears
        Set<List<Integer>> triplets = new HashSet<>();

        while (i < length) {

            //Basically doing 2sum II ,where sorted array was present and we put two pointers
            int L = i + 1;
            int R = length - 1;

            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];

                if (sum == target) {
                    triplets.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    L++;
                } else if (sum > target)
                    R--;
                else
                    L++;
            }
            i++;
        }
        return new ArrayList<>(triplets);
    }
}
