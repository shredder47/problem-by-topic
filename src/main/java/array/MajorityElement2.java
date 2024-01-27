package array;

import java.util.*;

//https://leetcode.com/problems/majority-element-ii/description/

/*
        Example 1:

        Input: nums = [3,2,3]
        Output: [3]

        Example 2:

        Input: nums = [1]
        Output: [1]

        Example 3:

        Input: nums = [1,2]
        Output: [1,2]
 */
public class MajorityElement2 {


    public List<Integer> majorityElement(int[] nums) {

        List<Integer> majorityElements = new ArrayList<>();

        int majorityCount = (int) Math.floor((double) nums.length /3);

        Map<Integer, Integer> numToOccurrence = new HashMap<>();

        for (int num : nums) {

            if (numToOccurrence.containsKey(num))
                numToOccurrence.put(num, numToOccurrence.get(num) + 1);
            else
                numToOccurrence.put(num,1);

        }

        for (Integer num : numToOccurrence.keySet()) {
            if(numToOccurrence.get(num) >majorityCount)
                majorityElements.add(num);
        }

        return majorityElements;
    }


}
