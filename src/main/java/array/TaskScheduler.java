package array;

import java.util.Arrays;

public class TaskScheduler {
    //https://leetcode.com/problems/task-scheduler/description/

//    Example 1:
//
//    Input: tasks = ["A","A","A","B","B","B"], n = 2
//
//    Output: 8
//
//    Explanation: A possible sequence is: A -> B -> idle -> A -> B -> idle -> A -> B.
//
//    After completing task A, you must wait two cycles before doing A again. The same applies to task B. In the 3rd interval, neither A nor B can be done, so you idle. By the 4th cycle, you can do A again as 2 intervals have passed.
//
//    Example 2:
//
//    Input: tasks = ["A","C","A","B","D","B"], n = 1
//
//    Output: 6
//
//    Explanation: A possible sequence is: A -> B -> C -> D -> A -> B.
//
//    With a cooling interval of 1, you can repeat a task after just one other task.
//
//    Example 3:
//
//    Input: tasks = ["A","A","A", "B","B","B"], n = 3
//
//    Output: 10
//
//    Explanation: A possible sequence is: A -> B -> idle -> idle -> A -> B -> idle -> idle -> A -> B.
//
//    There are only two types of tasks, A and B, which need to be separated by 3 intervals. This leads to idling twice between repetitions of these tasks.



    public int leastInterval(char[] arr, int n) {

        int feq[] = new int[26];
        for (char i : arr)
            feq[i - 'A']++;

        Arrays.sort(feq);

        int max = feq[feq.length - 1];

        int count = 0;

        for (int i : feq)
            if (i == max)
                count++;

        return Math.max(arr.length, (max - 1) * (n + 1) + count);
    }


}
