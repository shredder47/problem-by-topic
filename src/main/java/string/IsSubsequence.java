package string;


//https://leetcode.com/problems/is-subsequence/
public class IsSubsequence {

//    Example 1:
//
//    Input: s = "abc", t = "ahbgdc"
//    Output: true
//    Example 2:
//
//    Input: s = "axc", t = "ahbgdc"
//    Output: false

    public boolean isSubsequence(String s, String t) {

        if (s.isEmpty()) {
            return true;
        }

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()){

            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        return i == s.length();
    }

}
