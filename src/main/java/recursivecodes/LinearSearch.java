package recursivecodes;

public class LinearSearch {


    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println(linearSearch(arr, 0, arr.length - 1, 1));


    }

    private static boolean linearSearch(int[] arr, int low, int high, int numToFind) {

        if(arr.length == 0)
            return false;


        if (low <= high) {

            if (arr[low] == numToFind)
                return true;
            else
                return linearSearch(arr, ++low, high, numToFind);

        } else

            return false;
    }


}
