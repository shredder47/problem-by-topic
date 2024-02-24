package recursivecodes.hyp;

import java.util.Stack;

public class ReverseAStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        reverseStack(stack);
        System.out.println(stack);


    }

      /*
                5       1
                4       2
                3       3
                2       4
                1       5

                after popping 5

                4       1
                3       2
                2       3
                1       4
                ---------
                       [5]

                + Insert 5


         */

    private static void reverseStack(Stack<Integer> stack) {

        if(stack.size() <= 1)
            return;


        // if it can reverse for N, it can also reverse for N-1
        Integer topElement = stack.pop();

        // input reduced
        reverseStack(stack);

        insert(stack,topElement);


    }

    /*
       this can put the pop at last place
       stack    ,   pop
        1           5
        2
        3
        4

        it can also do for stack of size n-1 by popping one items then inserting the pop, and then after successful insertion,
        put back the popped item to the top

        stack , pop   temp
        2       5      [1]
        3
        4


        this means

        2
        3
        4
        5 <- pop inserted at last

        putting back the temp

        1 <--- temp
        2
        3
        4
        5


     */

    private static void insert(Stack<Integer> stack , int pop){
        // if stack is empty then inserting is straightforward
        if(stack.isEmpty()) {
            stack.push(pop);
            return;
        }

        Integer topItem = stack.pop();
        // reduced input
        insert(stack,pop);
        //after insertion putting back the popped element to the stack
        stack.push(topItem);


    }


}
