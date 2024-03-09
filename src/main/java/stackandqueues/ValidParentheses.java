package stackandqueues;

import java.util.Stack;

public class ValidParentheses {

    //https://leetcode.com/problems/valid-parentheses/

    /*
        Example 1:

        Input: s = "()"
        Output: true
        Example 2:

        Input: s = "()[]{}"
        Output: true
        Example 3:

        Input: s = "(]"
        Output: false
     */
    public boolean isValid(String s) {

        if (s.isEmpty() || s.length() == 1) return false;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {

            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else {
                if (stack.isEmpty() || c != stack.pop()) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }


}
