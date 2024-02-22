package recursivecodes;

import java.util.Stack;

public class SlackSortingRec {

    public static void main(String[] args) {


        Stack<Integer> integers = new Stack<>();
        integers.push(1);
        integers.push(3);
        integers.push(5);
        integers.push(7);
        integers.push(1);
        integers.push(0);


        sort(integers);

        System.out.println(integers);



    }


    private static void sort(Stack<Integer> stack){

        if(stack.size() <= 1)
            return;

//        [1,3,5,7,1,0] -> 0 1 1 3 5 7
        //if it can sort for stack of size N, it can also sort for stack of size n-1

        //hence reducing the size , Popped 0
        Integer pop = stack.pop();

        // [1,3,5,7,1] ->  1 1 3 5 7 + insert(0)
        sort(stack);

        // For inserting 0 to the n-1 sorted stack
        insert(stack,pop);


    }

    private static void insert(Stack<Integer> stack, Integer pop) {

        // Push the supplied value to stack if its either empty or last item <= pop ex:  2,3,5 , pop = 5 or 6, it can be inserted as it is.
        if(stack.isEmpty() || stack.peek() <= pop){
            stack.push(pop);
            return;
        }

        //if the last item is greater than pop, then pop the last item and insert the pop to the n-1 stack
        Integer temp = stack.pop();

        insert(stack,pop);
        //push the popped item back to the stack after inserting the pop
        stack.push(temp);
    }


}
