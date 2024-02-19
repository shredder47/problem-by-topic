package recursivecodes;

public class isSorted {


    public static void main(String[] args) {

        int[] arr = new int[]{1, 11, 2, 3, 4, 5, 6, 7};

        System.out.println(isSorted(arr, 0, arr.length - 1));
    }

    private static boolean isSorted(int[] arr, int low, int high) {

        if (arr.length == 0 || arr.length == 1) return true;

        if (low < high) {

            if (arr[low] <= arr[low + 1])
                return isSorted(arr, ++low, high);
            else
                return false;
        }

        return true;
    }


}
