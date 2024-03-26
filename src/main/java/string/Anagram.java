package string;


import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/valid-anagram/description/
public class Anagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] arr = new int[26];

        for (int i = 0 ; i < s.length() ; i++){
            arr[s.charAt(i) - 97] =  arr[s.charAt(i) - 97] + 1;
            arr[t.charAt(i) - 97] =  arr[t.charAt(i) - 97] - 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0 )
                return false;
        }

        return true;
    }

    public boolean isAnagram2(String s, String t) {

        if (s.length() != t.length()) return false;
        Map<Character, Integer> sFreq = new HashMap<>();
        Map<Character, Integer> tFreq = new HashMap<>();

        // Generating character -> frequency MAP
        for (int i = 0; i < s.length(); i++) {
            sFreq.put(s.charAt(i), sFreq.getOrDefault(s.charAt(i), 0) + 1);
            tFreq.put(t.charAt(i), tFreq.getOrDefault(t.charAt(i), 0) + 1);
        }

        // Iterating
        for (Character ch : sFreq.keySet()) {
            if (!tFreq.containsKey(ch))
                return false;

            if (!tFreq.get(ch).equals(sFreq.get(ch)))
                return false;
        }
        //Everything went smooth
        return true;
    }




}
