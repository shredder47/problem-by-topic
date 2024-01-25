package array;

//https://www.codingninjas.com/studio/problems/count-inversions_615
public class CountInversions {

    /*
            Sample Input 1 :
            3
            3 2 1
            Sample Output 1 :
            3

            (3, 2), (2, 1) and (3, 1).
     */
    public static long getInversions(long arr[], int n) {
        // Write your code here.

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j])
                    count++;

            }
        }

        return count;
    }
}
