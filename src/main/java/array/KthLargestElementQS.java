package array;


//https://leetcode.com/problems/kth-largest-element-in-an-array/description/

/*
Example 1:

Input: nums = [3,2,1,5,6,4], k = 2 = [6,5,4,3,2,1]
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 */
public class KthLargestElementQS {

    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSelect(int[] data, int low, int high, int kth) {

        if (low > high) {
            return -1;
        }

        int pivotIndex = partition(data, low, high);

        if (kth == pivotIndex) return data[pivotIndex];

        if (pivotIndex > kth) {
            return quickSelect(data, low, pivotIndex - 1, kth);
        } else
            return quickSelect(data, pivotIndex + 1, high, kth);

    }

    private int partition(int[] data, int low, int high) {

        int k = low - 1;
        int pivotValue = data[high];

        for (int i = low; i < high; i++) {

            if (data[i] < pivotValue) {
                k++;
                swap(data, k, i);
            }
        }
        k++;
        swap(data, k, high);

        return k;
    }

    private void swap(int[] data, int index1, int index2) {
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }


}
