package array;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/subsets/description/
public class Subsets {

//    Example 1:
//
//    Input: nums = [1,2,3]
//    Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
//    Example 2:
//
//    Input: nums = [0]
//    Output: [[],[0]]

// Logic -:https://youtu.be/Y85dfkCSlP8?si=CbRazpn2dkMUHE0-&t=342
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        List<List<Integer>> subset = new ArrayList<>();

        for (int num : nums) {

            for (List<Integer> integers : subsets) {

                List<Integer> curList = new ArrayList<>(integers);
                curList.add(num);
                subset.add(curList);
            }
            subsets.addAll(subset);
            subset = new ArrayList<>();

        }
        return subsets;
    }
}
