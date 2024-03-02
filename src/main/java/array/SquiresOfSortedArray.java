package array;

public class SquiresOfSortedArray {

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        // Biggest elements are to be present at the extremes
        // -4, -1, 0, 3, 10 || -4 might be smallest here, but when arranged in ascending, the biggest numbers are to be present at the extremes
        // hence we put pointers at the extremes and moving + or - from where we are finding bigger from then negative or positive portion after squiring
        int left = 0;
        int right = n - 1;
        // will populate the new array from the end, as want bigger numbers at the end
        int k = n - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[k--] = nums[left] * nums[left];
                left++;
            } else {
                result[k--] = nums[right] * nums[right];
                right--;
            }

        }

        return result;
    }

}
