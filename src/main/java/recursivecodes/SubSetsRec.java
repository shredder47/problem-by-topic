package recursivecodes;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/subsets/description/
public class SubSetsRec {

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
        List<Integer> subset = new ArrayList<>();

        int index = 0;

        solve(index, nums, subset, subsets);

        return subsets;
    }

    private void solve(int index, int[] nums, List<Integer> subset, List<List<Integer>> subsets) {
        if (index >= nums.length) {
            System.out.println("Index: " + index + " " + subset + " PUSHED to Subsets");
            subsets.add(new ArrayList<>(subset));

        } else {
            System.out.println("Index: " + index + " " + subset);
            solve(index + 1, nums, subset, subsets);

            System.out.println("Index: " + index + " , Pushing " + nums[index]);
            subset.add(nums[index]);

            solve(index + 1, nums, subset, subsets);
            System.out.println("Backtracking!");

            System.out.println("Index: " + index + " , Removing " + subset.get(subset.size() - 1));
            subset.remove(subset.size() - 1);

        }
    }


}
