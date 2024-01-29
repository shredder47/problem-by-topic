package array;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashSet;
import java.util.Set;

/*
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Example 4:

Input: s = "dvdf"
Output: 3

 */
public class LongestSubString {
    //  LR
    //  ||
    //   d  v  d  f

    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int right = 0;

        Set<Character> visited = new HashSet<>();

        int maxSubStringSoFar = 0;

        //right is supposed to move till the end of the string
        while (right < s.length()) {
            //if char is not at map, then no duplicate found,increase right
            if (!visited.contains(s.charAt(right))) {
                visited.add(s.charAt(right));
                right++;
                maxSubStringSoFar = Math.max(maxSubStringSoFar,visited.size());
                //if found duplicate, remove that char and increment the left pointer
            }else{
                visited.remove(s.charAt(left));
                left++;
            }


        }

        return maxSubStringSoFar;

    }


}
