package array;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/find-the-duplicate-number/description/
public class DuplicateNumber {
    public int findDuplicate(int[] nums) {


        Set<Integer> number = new HashSet<>();

        for (int num : nums) {
            if (number.contains(num)) {
                return num;
            } else
                number.add(num);
        }


        return 0;
    }
}
