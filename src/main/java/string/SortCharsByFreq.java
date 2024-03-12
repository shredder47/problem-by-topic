package string;

import java.util.*;

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

        //Make this a max heap
        PriorityQueue<Map.Entry<Character, Integer>> freqToChar = new PriorityQueue<>(Map.Entry.comparingByValue((o1, o2) -> o2 - o1));

        //Making Char To Freq
        Map<Character, Integer> charToFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charToFreq.put(s.charAt(i), charToFreq.getOrDefault(s.charAt(i), 0) + 1);
        }

        //Adding to Priority Queue
        freqToChar.addAll(charToFreq.entrySet());

        while (!freqToChar.isEmpty()){

            //Getting Chars one by one from Highest Freq to Lowest
            Map.Entry<Character, Integer> poll = freqToChar.poll();

            // To track how many char to print by its freq
            int counter = 0;
            int timesToPrint = poll.getValue();
            char letter = poll.getKey();

            while (counter < timesToPrint) {
                sb.append(letter);
                counter++;
            }
        }

        return sb.toString();
    }

}
