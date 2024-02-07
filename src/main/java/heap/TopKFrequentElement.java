package heap;

import java.util.*;

public class TopKFrequentElement {


    /*

    //https://leetcode.com/problems/top-k-frequent-elements/description/

    Example 1:

    Input: nums = [1,1,1,2,2,3], k = 2
    Output: [1,2]
    Example 2:

    Input: nums = [1], k = 1
    Output: [1]
     */


    public int[] topKFrequent(int[] nums, int k) {

        // Will store number to frequency of occurrence
        Map<Integer, Integer> numToFreq = new HashMap<>();

        for (int num : nums) {
            if (!numToFreq.containsKey(num)) {
                numToFreq.put(num, 1);
            } else {
                numToFreq.put(num, numToFreq.get(num) + 1);
            }
        }

        // Will store top repeating elements
        List<Integer> topKs = new ArrayList<>();

        List<Pair> frequencyToNumberPair = new ArrayList<>();

        for (Integer number : numToFreq.keySet()) {
            frequencyToNumberPair.add(new Pair(numToFreq.get(number), number));
        }

        int i = 0;
        frequencyToNumberPair.sort(Comparator.comparingInt(Pair::getFreq).reversed());

        for (Pair pair : frequencyToNumberPair) {
            if (i++ < k)
                topKs.add(pair.getNumber());
        }

        return topKs.stream().mapToInt(Integer::intValue).toArray();
    }

    public static class Pair {

        int freq;
        int number;

        public Pair(int freq, int number) {
            this.freq = freq;
            this.number = number;
        }

        public int getFreq() {
            return freq;
        }

        public void setFreq(int freq) {
            this.freq = freq;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }

}
