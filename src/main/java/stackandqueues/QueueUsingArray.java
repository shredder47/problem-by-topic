package stackandqueues;


//https://www.codingninjas.com/studio/problems/implement-queue-using-arrays_8390825?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
public class QueueUsingArray {

    int front, rear;
    int []arr;

    QueueUsingArray() {
        front = 0;
        rear = 0;
        arr = new int[100001];
    }

    // Enqueue (add) element 'e' at the end of the queue.
    public void enqueue(int e) {
        arr[rear++] = e;

    }

    // Dequeue (retrieve) the element from the front of the queue.
    public int dequeue() {

        if(front >= rear) return -1;
        return arr[front++];

    }


}
