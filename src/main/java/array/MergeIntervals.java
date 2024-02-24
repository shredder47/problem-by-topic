package array;


import java.util.*;

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

        int start = interval[0];
        int end = interval[1];

        if (mergedList.isEmpty())
            mergedList.add(Arrays.asList(start, end));
        else {

            //get last Intervals

            List<Integer> lastInterval = mergedList.get(mergedList.size() - 1);
            int lastStart = lastInterval.get(0);
            int lastEnd = lastInterval.get(1);

            //if incoming start is less than last end, merge it
            if (start <= lastEnd) {

                int newStart = Math.min(start, lastStart);
                int newEnd = Math.max(end, lastEnd);

                //is its merged, insert this by removing the old interval
                mergedList.remove(mergedList.size() - 1);
                mergedList.add(Arrays.asList(newStart, newEnd));
            } else {
                //interval cannot be merged, hence add as it is...
                mergedList.add(Arrays.asList(start, end));
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
