package stackandqueues;


import java.util.LinkedList;

//https://leetcode.com/problems/implement-stack-using-queues/description/
public class StackUsingQueue {


    private LinkedList<Integer> queue ;
    public StackUsingQueue() {

        queue = new LinkedList<>();
    }

    public void push(int x) {

        queue.addLast(x);
    }

    public int pop() {

        return queue.pollLast();

    }

    public int top() {
        return queue.peekLast();
    }

    public boolean empty() {

        return queue.isEmpty();
    }


}
