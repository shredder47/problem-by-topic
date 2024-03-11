package string;


// https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {

    /*
        Example 1:

        Input: strs = ["flower","flow","flight"]
        Output: "fl"

        Example 2:
        Input: strs = ["dog","racecar","car"]
        Output: ""

        Explanation: There is no common prefix among the input strings.
     */
    public String longestCommonPrefix(String[] strs) {

        StringBuilder longestPrefix = new StringBuilder();

        if (strs.length == 1) return strs[0];

        /* With this we will compare other string's letter */
        String comparingString = strs[0];

        for (int currentCharPtr = 0; currentCharPtr < comparingString.length(); currentCharPtr++) {

            char curChar = comparingString.charAt(currentCharPtr);
            boolean isTerminated = false;

            for (int i = 1; i < strs.length; i++) {
                //find the current string and its length
                String str = strs[i];
                int curStrLen = str.length();


                if (currentCharPtr < curStrLen && str.charAt(currentCharPtr) == curChar) {
                    continue; // just for code readability :)
                } else {
                    isTerminated = true;
                    break;
                }
            }

            // if any means do not terminate the current comparison add it to the builder
            if (!isTerminated)
                longestPrefix.append(curChar);
            else
                break;
        }

        return longestPrefix.toString();
    }
}
