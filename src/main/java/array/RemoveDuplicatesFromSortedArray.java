
package array;

public class RemoveDuplicatesFromSortedArray {

    //https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
/*
                  [0        1       2       3       4       5       6       7       8       9]
Input:     nums = [0    ,   0   ,   1   ,   1   ,   1   ,   2   ,   2   ,   3   ,   3   ,   4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

 */
    public int removeDuplicates(int[] nums) {

        int k = 1;
        int n = nums.length;


        for (int i = 1; i < n;i++){
            if(nums[i-1] != nums[i]){
                nums[k++] = nums[i];
            }
        }


        return k;
    }


}
