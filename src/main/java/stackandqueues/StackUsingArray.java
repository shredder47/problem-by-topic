package stackandqueues;

public class StackUsingArray {
    int[] data;
    int capacity;
    int pointer;

    StackUsingArray(int capacity) {

        this.data = new int[capacity];
        this.capacity = capacity;
        this.pointer = -1;
    }

    public void push(int num) {
        if (isFull() == 1) return;
        data[++pointer] = num;
    }

    public int pop() {
        if (isEmpty() == 1) return -1;
        return data[pointer--];
    }

    public int top() {
        if (isEmpty() == 1) return -1;
        return data[pointer];
    }

    public int isEmpty() {
        return pointer == -1 ? 1 : 0;
    }

    public int isFull() {
        return (pointer == capacity - 1) ? 1 : 0;

    }
}
