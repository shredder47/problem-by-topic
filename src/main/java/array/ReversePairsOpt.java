package array;


//https://leetcode.com/problems/reverse-pairs/description/
public class ReversePairsOpt {

    /*
        Input: nums = [1,3,2,3,1]
        Output: 2
        Explanation: The reverse pairs are:
        (1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
        (3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
     */


    public int reversePairs(int[] nums) {
        int[] pairs = new int[]{0};
        int[] ans = mergersort(nums, 0, nums.length - 1, pairs);
        return pairs[0];
    }

    public int[] mergersort(int[] nums, int left, int right, int[] pairs) {
        if (left == right) {
            return new int[]{nums[left]};
        }

        int mid = (left + right) / 2;
        int[] l = mergersort(nums, left, mid, pairs);
        int[] r = mergersort(nums, mid + 1, right, pairs);
        int[] m = new int[right - left + 1];

        int index1 = 0, index2 = 0;
        while (index1 < l.length && index2 < r.length) {
            if (l[index1] <= 2 * (long) r[index2]) {
                index1++;
            } else {
                pairs[0] += l.length - index1;
                index2++;
            }
        }


        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;
        while (idx1 < l.length && idx2 < r.length) {
            if (l[idx1] <= r[idx2]) {
                m[idx3++] = l[idx1++];
            } else {
                m[idx3++] = r[idx2++];
            }
        }

        if (idx1 < l.length) {
            for (int i = idx1; i < l.length; i++) {
                m[idx3++] = l[idx1++];
            }
        }

        if (idx2 < r.length) {
            for (int i = idx2; i < r.length; i++) {
                m[idx3++] = r[idx2++];
            }
        }

        return m;

    }

}




