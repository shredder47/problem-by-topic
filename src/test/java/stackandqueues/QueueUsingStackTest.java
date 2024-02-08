package stackandqueues;

import org.junit.Test;

public class QueueUsingStackTest {

    QueueUsingStack queue = new QueueUsingStack();

    @Test
    public void impl() {

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);


        System.out.println(queue.pop());

        queue.push(8);
        queue.push(9);

        System.out.println(queue.pop());
        queue.push(12);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());



        System.out.println(queue);

    }


}