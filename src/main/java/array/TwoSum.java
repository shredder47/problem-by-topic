package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //https://leetcode.com/problems/two-sum/description/

    /*
        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]
     */
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> numberToIndexMap = new HashMap<>();

        int[] targetNumIndex = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int reqNumber = target - nums[i];

            if (!numberToIndexMap.containsKey(reqNumber)) {
                numberToIndexMap.put(nums[i],i);
            }else{
                targetNumIndex[0] = numberToIndexMap.get(reqNumber);
                targetNumIndex[1] = i;
            }
        }
        return targetNumIndex;
    }

}
