package recursivecodes.hyp;

import java.util.Stack;

public class DeleteMiddleElementOfStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        //Its stack , so no 0 based indexing logic, deletion of mth item
        int middleIndex = (stack.size() / 2) +1;

        deleteMiddleElement(stack, middleIndex);

        System.out.println(stack);

    }


    private static void deleteMiddleElement(Stack<Integer> stack, int middle) {

        if(stack.isEmpty())
            return;

        //base case size is equal to the middle index , pop it, coz popping from top is straightforward
        if (stack.size() == middle) {
            stack.pop();
            return;
        }

        //reducing size of stack
        int temp = stack.pop();

        //if its working for n size stack, it will also work for n-1 size stack
        deleteMiddleElement(stack, middle);

        // pushing back the popped item
        stack.push(temp);
    }

    /*

        |1|
        |2|
        |3| <- M = 3            5/2 + 2 = 2 + 1 = 3
        |4|
        |5|
        ___
        S = 5

        |2|
        |3| <- M = 3  |1|
        |4|
        |5|
        ___
        S = 4


        |3| <- M = 3  |2| |1|
        |4|
        |5|
        ___
        S = 3 NOW POP

     */

}
