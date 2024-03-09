package array;

public class MinimumCommonValue {

//    https://leetcode.com/problems/minimum-common-value/description/

//    Example 1:
//
//    Input: nums1 = [1,2,3], nums2 = [2,4]
//    Output: 2
//    Explanation: The smallest element common to both arrays is 2, so we return 2.
//    Example 2:
//
//    Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
//    Output: 2
//    Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.

    public int getCommon(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;

        int length1 = nums1.length;
        int length2 = nums2.length;

        // For faster solution
        if (nums1[length1 - 1] < nums2[0] || nums2[length2 - 1] < nums1[0])
            return -1;

        // Two pointer approach
        while (i < length1 && j < length2) {
            if (nums1[i] == nums2[j])
                return nums1[i];
            else if (nums1[i] > nums2[j])
                j++;
            else
                i++;
        }
        return -1;
    }



}
