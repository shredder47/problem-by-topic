package array;

public class TwoSum2 {

    //    Input: numbers = [1,3,4,5,7,10,11], target = 9
    //    Output: [4,5]
    public int[] twoSum(int[] nums, int target) {

        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        int[] targetPosition = new int[2];

        while (leftPointer <= rightPointer) {
            if (nums[leftPointer] + nums[rightPointer] == target) {
                targetPosition[0] = leftPointer + 1;
                targetPosition[1] = rightPointer + 1;
                return targetPosition;
            }

            //As its sorted, if the summation is more than target, only if we decrease right,it will go towards
            //target.
            if (nums[leftPointer] + nums[rightPointer] > target) {
                rightPointer--;
            } else
                leftPointer++;


        }

        return targetPosition;
    }

}
