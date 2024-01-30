package array;


import java.util.HashMap;

/*
        1       1      0        1       1       0       0
               |------------------------------------------|
  Steps to perform:
        1       1      -1       1       1       -1      -1      -> convert all 0 to -1

        [1]     2       1       2       3       2       [1]

 */
public class LargestSubArrWithEqual1And0 {

    int maxLen(int[] A, int n) {
        // Your code here
        HashMap<Integer, Integer> cumSumToIndex = new HashMap<>();
        int target = 0;
        int maxLength = 0;
        int cumSum = 0;

        for (int i = 0; i < n; i++) {

            if(A[i] == 0){
                cumSum = cumSum + (-1);
            }else{
                cumSum = cumSum + A[i];
            }

            if (cumSum == target) {
                maxLength = i + 1; // current pointer + 1(as arr starts from 0)
            } else {
                if (cumSumToIndex.get(cumSum - target) != null) {
                    // Index after which the numbers are summing up to target
                    int idx = cumSumToIndex.get((cumSum - target));

                    //Number of digits forming the required target
                    int numDigits = i - idx;

                    //Store Max number of digits required/ length
                    maxLength = Math.max(maxLength, numDigits);
                } else {
                    //if current cumulative sum - target value doesn't exist. i.e no digits sum are there that when subtracted
                    //it will give the target.
                    cumSumToIndex.put(cumSum, i);
                }
            }
        }
        return maxLength;
    }

}
