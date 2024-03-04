package array;

//https://leetcode.com/problems/find-missing-and-repeated-values/description/
public class MergeSortedArray {


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] combined = new int[m + n];

        int left = 0;
        int right = 0;
        int i = 0;

        while (left < m && right < n) {
            if (nums1[left] < nums2[right])
                combined[i++] = nums1[left++];
            else
                combined[i++] = nums2[right++];
        }
        //Copy Leftovers
        while (left < m)
            combined[i++] = nums1[left++];
        while (right < n)
            combined[i++] = nums2[right++];

        for (int idx = 0; idx < combined.length; idx++) {
            nums1[idx] = combined[idx];
        }
    }
}
