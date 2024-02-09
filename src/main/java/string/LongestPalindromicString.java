package string;


//https://leetcode.com/problems/longest-palindromic-substring/description/
public class LongestPalindromicString {

    /*
        Example 1:

        Input: s = "babad"
        Output: "bab"
        Explanation: "aba" is also a valid answer.
        Example 2:

        Input: s = "cbbd"
        Output: "bb"

         Input: s = "ac"
        Output: "a"
     */


    public String longestPalindrome(String s) {
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            String string1 = explodeSingly(s, i);
            String string2 = explodeDoubly(s, i);

            if (string1.length() > string2.length()) {
                if (string1.length() > longest.length())
                    longest = string1;
            } else {
                if (string2.length() > longest.length())
                    longest = string2;
            }


        }

        return longest;

    }

    //For dealing with string where no consecutive letters are same : case: b [a] b a d

    // i=0 l=0,r=0 ,s = 'b' - cannot expand further
    // i=1 l=1,r=1 ,s = 'a' - can expand
    // i=1 l=0,r=2 ,s = 'bab' - cannot expand further
    // i=2 l=2,r=2 ,s = 'b' - can expand further
    // i=2 l=1,r=3 ,s = 'aba' - cannot expand further
    // i=3 l=3,r=3 ,s = 'd' - cannot expand further

    private String explodeSingly(String s, int index) {

        String longest = "";
        int left = index;
        int right = index;
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                longest = s.substring(left, right + 1);
            } else
                break;
            left--;
            right++;

        }
        return longest;
    }
    // When exploding singly it cannot yield any result,so we need to explode from two point
    //For dealing with case where two consecutive letter is same, we expand from that point : a [b] [b] a
    private String explodeDoubly(String s, int index) {
        String longest = "";
        int left = index;
        int right = index + 1;
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                longest = s.substring(left, right + 1);
            } else
                break;
            left--;
            right++;

        }
        return longest;
    }
}
