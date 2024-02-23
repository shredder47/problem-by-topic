package array;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/majority-element/description/

/*

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

    Example 1:

    Input: nums = [3,2,3]
    Output: 3
    Example 2:

    Input: nums = [2,2,1,1,1,2,2]
    Output: 2
 */
public class    MajorityElement {


    public int majorityElement(int[] nums) {

        int majorityCount = (int) Math.floor((double) nums.length /2);

        Map<Integer, Integer> numToOccurrence = new HashMap<>();

        for (int num : nums) {

            if (numToOccurrence.containsKey(num))
                numToOccurrence.put(num, numToOccurrence.get(num) + 1);
            else
                numToOccurrence.put(num,1);

            if(numToOccurrence.get(num) > majorityCount) return num;
        }

        return 0;
    }


}
