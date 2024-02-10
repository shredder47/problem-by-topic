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

        for (int curLetterPointer = 0; curLetterPointer < comparingString.length(); curLetterPointer++) {

            char curCharVal = comparingString.charAt(curLetterPointer);
            boolean isTerminated = false;

            for (int currentStringPointer = 1; currentStringPointer < strs.length; currentStringPointer++) {
                //find the current string and its length
                String str = strs[currentStringPointer];
                int curStrLen = str.length();


                if (curLetterPointer < curStrLen && str.charAt(curLetterPointer) == curCharVal) {
                    continue; // just for code readability :)
                } else {
                    isTerminated = true;
                    break;
                }
            }

            // if any means do not terminate the current comparison add it to the builder
            if (!isTerminated)
                longestPrefix.append(curCharVal);
            else
                break;
        }

        return longestPrefix.toString();

    }


}
