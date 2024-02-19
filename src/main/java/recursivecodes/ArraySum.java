package recursivecodes;

public class ArraySum {


    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println(sum1(arr, 0, arr.length - 1));


    }

    private static int sum1(int[] arr, int i, int n) {

        if (i > n) return 0;
        else
            return arr[i] + sum1(arr, ++i, n);
    }




}
