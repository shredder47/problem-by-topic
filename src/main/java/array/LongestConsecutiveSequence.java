package array;


import java.util.HashSet;
import java.util.Set;

/*

https://leetcode.com/problems/longest-consecutive-sequence/

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

 */
public class LongestConsecutiveSequence {


    public int longestConsecutive(int[] nums) {

        //Creating a set so that search is O(1)
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }

        int maxConsecutiveCount = 0;

        for (Integer number : numbers) {
            int currentCount = 0;

            //start of a sequence check (if a number doesnt have previous value, it means start)
            if (!numbers.contains(number - 1)) {
                currentCount++;
                int i = 1;
                while (numbers.contains(number + i)) { //if the current number has its next value, then increment the count
                    currentCount++;
                    i++;
                }
            }
            maxConsecutiveCount = Math.max(maxConsecutiveCount, currentCount);
        }

        return maxConsecutiveCount;

    }


}
