package heap;

import java.util.*;

public class LeastNumberOfUniqueIntAfterKRemoval {

    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        Map<Integer, Integer> numToFreq = new HashMap<>();

        for (int i : arr) {
            numToFreq.put(i, numToFreq.getOrDefault(i, 0) + 1);
        }

        Set<Map.Entry<Integer, Integer>> entries = numToFreq.entrySet();

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((Map.Entry.comparingByValue())); //Comparing by Freq!
        pq.addAll(entries);

        int i = 0;

        while (i < k) {
            if (!pq.isEmpty()) {
                Map.Entry<Integer, Integer> peek = pq.peek();
                int freq = peek.getValue();
                freq--;
                if (freq == 0)
                    pq.poll();
                else
                    peek.setValue(freq);
            }

            i++;
        }

        return pq.size();

    }


    public static class Pair {

        int number;
        int freq;

        public Pair(int number, int freq) {
            this.number = number;
            this.freq = freq;
        }

        public int getNumber() {
            return number;
        }

        public int getFreq() {
            return freq;
        }
    }


}
