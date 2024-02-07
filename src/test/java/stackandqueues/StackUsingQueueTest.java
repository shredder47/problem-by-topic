package stackandqueues;

import org.junit.Test;

public class StackUsingQueueTest {

    StackUsingQueue stack = new StackUsingQueue();

    @Test
    public void impl() {

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.top());
        System.out.println(stack.pop());

        System.out.println(stack.toString());

    }


}