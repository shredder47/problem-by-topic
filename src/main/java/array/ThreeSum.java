package array;

import java.util.*;

public class ThreeSum {
    //                         i       L                 R
    //                         |       |                 |
    //   Input: nums = [-4  ,  -1  ,  -1  ,  0  ,  1  ,  2]


    //   Output: [[-1,-1,2],[-1,0,1]]
    public List<List<Integer>> threeSum(int[] nums) {

        int length = nums.length;
        int target = 0;
        int i = 0;

        Arrays.sort(nums);

        Set<List<Integer>> triplets = new HashSet<>();

        while (i < length) {

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
