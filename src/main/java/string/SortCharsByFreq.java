package string;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/sort-characters-by-frequency/description/?envType=daily-question&envId=2024-02-07
public class SortCharsByFreq {


//    Example 1:
//
//    Input: s = "tree"
//    Output: "eert"
//    Explanation: 'e' appears twice while 'r' and 't' both appear once.
//            So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
//            Example 2:
//
//    Input: s = "cccaaa"
//    Output: "aaaccc"
//    Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
//    Note that "cacaca" is incorrect, as the same characters must be together.
//    Example 3:
//
//    Input: s = "Aabb"
//    Output: "bbAa"
//    Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
//    Note that 'A' and 'a' are treated as two different characters.

    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Pair> freqToChar = new PriorityQueue<>(Comparator.comparingInt(Pair::getFreq).reversed());

        //Making Char To Freq
        Map<Character, Integer> charToFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charToFreq.put(s.charAt(i), charToFreq.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Making Freq To Char for Sorting by Freq (using priority queue so that its sorted by Freq HIGH to LOW
        for (Character c : charToFreq.keySet()) {
            freqToChar.add(new Pair(charToFreq.get(c), c));
        }

        while (!freqToChar.isEmpty()){

            //Getting Chars one by one from Highest Freq to Lowest
            Pair pair = freqToChar.poll();

            // To track how many char to print by its freq
            int counter = 0;
            int timesToPrint = pair.getFreq();
            char letter = pair.getLetter();

            while (counter < timesToPrint) {
                sb.append(letter);
                counter++;
            }
        }

        return sb.toString();
    }

    public static class Pair {
        int freq;
        char letter;

        public Pair(int freq, char letter) {
            this.freq = freq;
            this.letter = letter;
        }

        public int getFreq() {
            return freq;
        }

        public void setFreq(int freq) {
            this.freq = freq;
        }

        public char getLetter() {
            return letter;
        }

        public void setLetter(char letter) {
            this.letter = letter;
        }
    }

}
