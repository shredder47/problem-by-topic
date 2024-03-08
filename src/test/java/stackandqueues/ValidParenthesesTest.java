package stackandqueues;

import org.junit.Test;

public class ValidParenthesesTest {

    ValidParentheses v = new ValidParentheses();
    @Test
    public void isValid() {
        System.out.println(v.isValid("(("));
//        System.out.println(v.isValid("("));
//        System.out.println(v.isValid("[()]"));
//        System.out.println(v.isValid("[()])"));
//        System.out.println(v.isValid("()[]{}"));
    }
}