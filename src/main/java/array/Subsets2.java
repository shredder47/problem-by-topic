package array;

import java.util.*;

//https://leetcode.com/problems/subsets-ii/description/
public class Subsets2 {

//    Example 1:
//    Here numbers contains duplicate items
//    Input: nums = [1,2,2]
//    Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
//    Example 2:
//
//    Input: nums = [0]
//    Output: [[],[0]]


    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> outputs = new HashSet<>();
        outputs.add(new ArrayList<>());

        Set<List<Integer>> curOutputs = new HashSet<>();

        for (int num : nums) {

            for (List<Integer> curElements : outputs) {
                List<Integer> temp = new ArrayList<>(curElements);
                temp.add(num);
                curOutputs.add(temp);

            }
            outputs.addAll(curOutputs);
            curOutputs = new HashSet<>();
        }

        return new ArrayList<>(outputs);
    }
}

