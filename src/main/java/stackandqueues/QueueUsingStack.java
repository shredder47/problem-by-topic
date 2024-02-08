package stackandqueues;

import java.util.Stack;

public class QueueUsingStack {

    // https://leetcode.com/problems/implement-queue-using-stacks/
    //Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).


    //
    Stack<Integer> stackPush;
    Stack<Integer> stackPop;

    public QueueUsingStack() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    public void push(int x) {

        stackPush.add(x);
    }

    public int pop() {


        int pop;
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty())
                stackPop.add(stackPush.pop());
        }
        pop = stackPop.pop();

        return pop;
    }

    public int peek() {
        int peek;
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty())
                stackPop.add(stackPush.pop());
        }
        peek = stackPop.peek();

        return peek;
    }

    public boolean empty() {

        if(stackPop.isEmpty() && !stackPush.isEmpty()) return false;
        if(stackPush.isEmpty() && !stackPop.isEmpty()) return false;
        return true;
    }


}
