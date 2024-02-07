package heap;

public class MinHeap {

    int INIT_CAP = 16;
    int size = 0;

    int[] data;

    public MinHeap() {
        this.data = new int[INIT_CAP];
    }

    public void insert(int value) {
        ensureCapacity();

        data[size] = value;
        size++;
        heapifyUp();

    }

    private void heapifyUp() {

        int currentIndex = size - 1;
        while (hasParent(currentIndex)) {
            int currentValue = data[currentIndex];
            int currentParentIndex = getParentIndex(currentIndex);
            int parentValue = data[currentParentIndex];

            if (parentValue > currentValue) {
                swap(currentParentIndex, currentIndex);
                currentIndex = currentParentIndex;
            } else
                break;
        }
    }

    private void heapifyDown() {

        int currentIndex = 0;
        int insertedValue = data[currentIndex];
        while (hasLeftChild(currentIndex)) {

            int lowestValue = 0;
            int lowestIndex = 0;

            lowestIndex = getLeftChildIndex(currentIndex);
            lowestValue = data[lowestIndex];

            if (hasRightChild(currentIndex)) {
                int rightChildIndex = getRightChildIndex(currentIndex);
                int rightChildValue = data[rightChildIndex];

                if (rightChildValue < lowestValue) {
                    lowestValue = rightChildValue;
                    lowestIndex = rightChildIndex;
                }
            }
            if (insertedValue < lowestValue) break;
            swap(currentIndex, lowestIndex);
            currentIndex = lowestIndex;

        }
    }

    public int extractMin() {
        if (size == 0) return 0;

        int value = data[0];
        data[0] = data[size - 1];
        size--;
        heapifyDown();

        return value;
    }

    public void swap(int index1, int index2) {

        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }


    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;

    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;

    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }


    private void ensureCapacity() {

        if (size >= INIT_CAP) {
            int newCapacity = 2 * INIT_CAP;

            int[] newArr = new int[newCapacity];

            for (int i = 0; i < data.length; i++) {

                newArr[i] = data[i];
            }

            INIT_CAP = newCapacity;
            data = newArr;
        }


    }

}
