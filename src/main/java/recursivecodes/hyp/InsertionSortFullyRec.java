package recursivecodes.hyp;

import java.util.Arrays;

public class InsertionSortFullyRec {


    public static void main(String[] args) {

        int[] arr = new int[]{2, 1, 4, 3,3};

        insertionSort(arr, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }


    // [2,1,4,3] -> 1,2,3,4
    private static void insertionSort(int[] arr, int n) {

        if (n <= 1)
            return;

        // smaller input (size reduce by one) [1,2,4]
        insertionSort(arr, n - 1); //should produce 1,2,4 + Insert (n-1) or 3 in correct place

        //Insert can place an item at n on sorted array, now for smaller input (n-1)
        insertElement(arr, n - 1);

    }

    private static void insertElement(int[] arr, int nthIndex) {
        //in case of [1,2,3] , arr[n] = 4, directly insert or do nothing
        if (nthIndex == 0 || arr[nthIndex - 1] <= arr[nthIndex])
            return;


        //in case of [1,2,4] , arr[n] = 3
        // as 4 > 3, it cannot be inserted directly
        // decreasing the index, 1,2 and here making the input as 3 instead of 4, so that we can be inserted beside 2...

        int temp = arr[nthIndex - 1];
        arr[nthIndex - 1] = arr[nthIndex];
        arr[nthIndex] = temp;

        insertElement(arr, nthIndex - 1);

    }


}


