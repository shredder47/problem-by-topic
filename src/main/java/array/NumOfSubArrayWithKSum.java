package array;


import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/subarray-sum-equals-k/description/

    Example 1:

    Input: nums = [1,1,1], k = 2
    Output: 2
    Example 2:

    Input: nums = [1,2,3], k = 3
    Output: 2

 */
public class NumOfSubArrayWithKSum {

    /*                                                i
        A0 A1 A2 A3 A4 A5...... .... ........................AN
        <-----------(CUMSUM - K)---------><-----K---->

        <-------------------------------------------->
                             CUMSUM

     */

    //Todo fix
    public int subarraySum(int[] nums, int k) {

        int cnt = 0;

        int curCumSum = 0;



        Map<Integer, Integer> cumSumToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            curCumSum += num;

            if(curCumSum == k) {
                cnt++;
            }

            if(cumSumToIndex.containsKey(curCumSum - k)){

            }

        }

        return cnt;
    }
}
