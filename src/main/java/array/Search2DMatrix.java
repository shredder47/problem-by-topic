package array;

//https://leetcode.com/problems/search-a-2d-matrix/description/
public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        /*

                {1,  3,  5,   7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
         */

        int m = matrix[0].length;

        for (int[] ints : matrix) {

            int low = ints[0];
            int high = ints[m - 1];

            // As mentioned, all rows are sorted, we're selecting the correct row where we can do the binary search
            if (target >= low && target <= high) {
                return binarySearch(ints, 0, m - 1, target);
            }
        }

        //if number is not in the range or any rows or number not present in selected row
        return false;
    }

    public boolean binarySearch(int[] arr, int low, int high, int target) {

        //base case when left pointer crosses right pointer :)
        if (low > high)
            return false;

        int mid = (high + low) / 2;

        if (arr[mid] == target) return true;

        if (target < arr[mid])
            return binarySearch(arr, low, mid-1, target);
        else
            return binarySearch(arr, mid + 1, high, target);
    }

}
