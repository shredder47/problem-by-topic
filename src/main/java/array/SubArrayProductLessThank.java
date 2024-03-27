package array;

public class SubArrayProductLessThank {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k == 0) {
            return 0;
        }
        int c = 0;
        int prod = 1;

        for (int i = 0, end = 0; end < nums.length; end++) {
            prod *= nums[end];
            while (prod >= k && i <= end) {
                prod = prod / nums[i];
                i++;
            }
            c += end - i + 1;
        }
        return c;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 6};

        System.out.println(numSubarrayProductLessThanK(arr, 100));
    }
}
