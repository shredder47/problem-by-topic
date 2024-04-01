package string;

public class LengthOfLastWord {

    //https://leetcode.com/problems/length-of-last-word/

//    Example 1:

//    Input: s = "Hello World"
//    Output: 5
//    Explanation: The last word is "World" with length 5.
//    Example 2:
//
//    Input: s = "   fly me   to   the moon  "
//    Output: 4
//    Explanation: The last word is "moon" with length 4.
//    Example 3:
//
//    Input: s = "luffy is still joyboy"
//    Output: 6
//    Explanation: The last word is "joyboy" with length 6.


    public int lengthOfLastWord(String s) {

        int length = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == ' ') {
                if (length > 0)
                    break;
                else
                    continue;
            } else {
                length++;
            }

        }
        return length;
    }
}
