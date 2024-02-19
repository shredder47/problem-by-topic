package recursivecodes;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = new int[]{4, 3, 5, 7, 8,100,3,1,4,6};

        selectionSort(arr, 0);

        System.out.println(Arrays.toString(arr));

    }


    private static void selectionSort(int[] arr, int sr){

        if(arr.length <= 1)
            return;

        if(sr >= arr.length -1)
            return;

        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int i = sr;

        //find min from the array from range SR TO ARR End
        while (i <= arr.length -1){
           if(arr[i] < min){
               min = arr[i];
               minIndex = i;
           }
            i++;
        }

        // SET THE MIN VALUE TO SR Pointer
        swap(arr,minIndex,sr);

        //Recompute from SR + 1, as we already have sorted elements inside Sorted Range
        selectionSort(arr,++sr);
    }

    public static void swap(int arr[], int position1, int position2) {

        int temp = arr[position2];
        arr[position2] = arr[position1];
        arr[position1] = temp;
    }
}
