package string;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagram {

    //https://leetcode.com/problems/group-anagrams/

    /*
        Given an array of strings strs, group the anagrams together. You can return the answer in any order.
        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

        Example 1:

        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        Example 2:

        Input: strs = [""]
        Output: [[""]]
        Example 3:

        Input: strs = ["a"]
        Output: [["a"]]
    */

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> keyToWords = new HashMap<>();

        for (String str : strs) {

            int[] arr = new int[26];

            for (int i = 0; i < str.length(); i++) {
                arr[str.charAt(i) - 97] = arr[str.charAt(i) - 97] + 1;
            }


            String finalKey = Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(","));

            if (keyToWords.containsKey(finalKey)) {
                keyToWords.get(finalKey).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                keyToWords.put(finalKey, list);
            }
        }

        return new ArrayList<>(keyToWords.values());
    }


}
