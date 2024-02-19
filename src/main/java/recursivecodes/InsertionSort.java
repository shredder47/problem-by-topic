package recursivecodes;

import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {

        int[] arr = new int[]{4, 3, 5, 7, 8,100,3,1,4,6};

        insertionSort(arr, 1);

        System.out.println(Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr, int sr) {

        if (arr.length <= 1)
            return;

        if (sr >= arr.length)
            return;

        int ptr = sr;

        //continue swapping when we see selected element is lesser than the next element   ex   4 , 3 ,here 3 is selected and its lesser than 4, swap it.
        while (ptr > 0 && arr[ptr] < arr[ptr - 1]) {

            swap(arr, ptr, ptr - 1);
            ptr--;
        }

        insertionSort(arr,++sr);

    }


    public static void swap(int arr[], int position1, int position2) {

        int temp = arr[position2];
        arr[position2] = arr[position1];
        arr[position1] = temp;
    }

}


