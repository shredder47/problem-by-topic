package array;


//https://leetcode.com/problems/reverse-pairs/description/
public class ReversePairs {

    /*                 0  1  2  3  4
        Input: nums = [1  3  2  3  1]
        Output: 2
        Explanation: The reverse pairs are:
        (1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
        (3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1

        A reverse pair is a pair (i, j) where:
        0 <= i < j < nums.length and
        nums[i] > 2 * nums[j].

     */

    public int reversePairs(int[] nums) {

        return sort(nums, 0, nums.length- 1) ;
    }

    public int sort(int[] arr, int low, int high) {
        int count = 0;

        if (low >= high) return count;

        int mid = (low + high) / 2;

        count += sort(arr, low, mid);
        count += sort(arr, mid + 1, high);
        count += countPairs(arr, low, mid, high);

        merge(arr, low, mid, high);

        return count;
    }

    private void merge(int[] data, int startIndex, int midIndex, int endIndex) {

        int[] mergeArr = new int[endIndex - startIndex + 1];

        int leftPointer = startIndex;
        int rightPointer = midIndex + 1;
        int mergeArrPointer = 0;

        //do the comparison and populate the mergeArr
        while (leftPointer <= midIndex && rightPointer <= endIndex) {

            if (data[leftPointer] <= data[rightPointer])
                mergeArr[mergeArrPointer++] = data[leftPointer++];
            else
                mergeArr[mergeArrPointer++] = data[rightPointer++];
        }

        while (leftPointer <= midIndex) {
            mergeArr[mergeArrPointer++] = data[leftPointer++];
        }
        while ((rightPointer <= endIndex)) {
            mergeArr[mergeArrPointer++] = data[rightPointer++];
        }

        for (int i = 0, j = startIndex; i < mergeArr.length; i++, j++) {
            data[j] = mergeArr[i];

        }

    }

    public int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) arr[i] > 2 * (long) arr[right])
                right++;
            count += (right - (mid + 1));
        }
        return count;
    }

}




