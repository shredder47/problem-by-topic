package stackandqueues;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/next-greater-element-i/description/
public class NextGreaterElement1 {

    /*
        Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
        Output: [-1,3,-1]
        Explanation: The next greater element for each value of nums1 is as follows:
        - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
        - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
        - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
     */

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> num2ToNext = new HashMap<>();
        int[] res = new int[nums1.length];

        for (int i = 0; i < nums2.length; i++) {

            int cur = nums2[i];
            Integer next = null;

            for (int j = i + 1; j < nums2.length; j++) {

                if (nums2[j] > cur) {
                    next = nums2[j];
                    break;
                }
            }

            if (next != null)
                num2ToNext.put(cur, next);

        }

        for (int i = 0; i < nums1.length; i++) {
            int cur = nums1[i];
            res[i] = num2ToNext.getOrDefault(cur, -1);

        }

        return res;
    }

}
