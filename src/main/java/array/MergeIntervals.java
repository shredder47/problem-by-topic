package array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// https://leetcode.com/problems/merge-intervals/description/
public class MergeIntervals {


    //[[1,3],[2,6],[8,10],[15,18]]
    public int[][] merge(int[][] intervals) {

        List<List<Integer>> mergedList = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        for (int[] interval : intervals) {
            insertIntervals(interval, mergedList);
        }

        return convertListToArr(mergedList);
    }

    public void insertIntervals(int[] interval, List<List<Integer>> mergedList) {

        if (mergedList.isEmpty())//First Time
            mergedList.add(Arrays.asList(interval[0], interval[1]));
        else {
            List<Integer> lastInterval = mergedList.get(mergedList.size() - 1);

            int incomingLowerBound = interval[0];
            int incomingUpperBound = interval[1];

            Integer lastLowerBound = lastInterval.get(0);
            Integer lastUpperBound = lastInterval.get(1);

            if (incomingLowerBound <= lastUpperBound) {

                int finalLowerBound = Math.max(incomingLowerBound,lastLowerBound);
                int finalUpperBound = Math.max(incomingUpperBound,lastUpperBound);

                List<Integer> mergedItem = Arrays.asList(finalLowerBound, finalUpperBound);
                // Remove last item
                mergedList.remove(mergedList.size() - 1);
                // Added merged Entry
                mergedList.add(mergedItem);
            } else {
                // Add the interval to the list
                mergedList.add(Arrays.asList(incomingLowerBound, incomingUpperBound));
            }
        }

    }

    public int[][] convertListToArr(List<List<Integer>> mergedList) {
        int[][] mergedIntervals = new int[mergedList.size()][2];

        int i = 0;
        for (List<Integer> integers : mergedList) {
            for (int j = 0; j < 2; j++) {
                mergedIntervals[i][j] = integers.get(j);
            }
            i++;
        }
        return mergedIntervals;
    }

}
