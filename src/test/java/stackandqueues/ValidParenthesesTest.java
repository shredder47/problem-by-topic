package stackandqueues;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    ValidParentheses v = new ValidParentheses();
    @Test
    public void isValid() {
        Assert.assertFalse(v.isValid("(("));
        Assert.assertFalse(v.isValid("("));
        Assert.assertFalse(v.isValid("[()])"));

        Assert.assertTrue(v.isValid("[()]"));
        Assert.assertTrue(v.isValid("()[]{}"));
    }
}