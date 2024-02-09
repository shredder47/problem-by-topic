package string;


//https://leetcode.com/problems/reverse-words-in-a-string/description/
public class ReverseWordsInString {

    /*
        Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.



        Example 1:

        Input: s = "the sky is blue"
        Output: "blue is sky the"
        Example 2:

        Input: s = "  hello world  "
        Output: "world hello"
        Explanation: Your reversed string should not contain leading or trailing spaces.
        Example 3:

        Input: s = "a good   example"
        Output: "example good a"
        Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
     */


    public String reverseWords(String s) {

        StringBuilder finalString = new StringBuilder();

        StringBuilder word = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {

            //If Char is not space, build the word
            if (s.charAt(i) != ' ') {
                word.append(s.charAt(i));
            } else {
                // If encounter space that means word ended, reverse and it to final string
                addToResult(word, finalString);
            }
        }
        //For last word which will not encounter space but needs to be added
        addToResult(word, finalString);

        return finalString.toString().trim();
    }

    private void addToResult(StringBuilder word, StringBuilder finalString) {
        String reverse = reverse(word);

        if (!reverse.isEmpty())
            finalString.append(reverse).append(" ");
        else return; // Do nothing if we encounter empty string

        //empty the SB
        word.delete(0, word.length());
    }

    private String reverse(StringBuilder sb) {
        if(sb.toString().isEmpty()) return "";

        StringBuilder temp = new StringBuilder();
        String rev = sb.toString();

        for (int i = rev.length() - 1; i >= 0; i--) {
            temp.append(rev.charAt(i));
        }
        return temp.toString();
    }

}
