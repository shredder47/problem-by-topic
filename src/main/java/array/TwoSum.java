package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //2, 7, 11, 15
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> numberToIndexMap = new HashMap<>();

        int[] targetNumIndex = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int reqNumber = target - nums[i];

            if (!numberToIndexMap.containsKey(reqNumber)) {
                numberToIndexMap.put(nums[i],i);

            }else{
                targetNumIndex[0] = numberToIndexMap.get(reqNumber);
                targetNumIndex[1] = i;
            }
        }


        return targetNumIndex;
    }

}
