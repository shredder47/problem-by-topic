package array;

//https://leetcode.com/problems/sort-colors/description/
public class SortColors {

    public void sortColors(int[] arr) {

        int zeroPtr = 0;
        int twoPtr = arr.length - 1;
        int cursor = 0;

        //  c,zp                  tp
        //  ||                    |
        // [1          0          2] c=0,zp=0,tp=2


        //  zp         c          tp
        //  |          |          |
        // [1          0          2] c=1,zp=0,tp=2        arr[1] == 0, swap

        //           zp,c          tp
        //            ||          |
        // [0          1          2] c=1,zp=1,tp=2        arr[1] == 1, c++

        // c >= tp end


        while (cursor <= twoPtr) {

            if (arr[cursor] == 0) {
                swap(arr, zeroPtr, cursor);
                zeroPtr++;
                cursor++;
            } else if (arr[cursor] == 2) {
                swap(arr, twoPtr, cursor);
                twoPtr--;
            } else if(arr[cursor] == 1)
                cursor++;
            else {
                //do nothing :)
            }
        }
    }


    private void swap(int[] nums, int location1, int location2) {
        int temp = nums[location2];
        nums[location2] = nums[location1];
        nums[location1] = temp;
    }

}
