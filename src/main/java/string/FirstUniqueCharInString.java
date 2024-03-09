package string;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/first-unique-character-in-a-string/description
public class FirstUniqueCharInString {

//    Example 1:
//
//    Input: s = "leetcode"
//    Output: 0
//    Example 2:
//
//    Input: s = "loveleetcode"
//    Output: 2
//    Example 3:
//
//    Input: s = "aabb"
//    Output: -1


    public int firstUniqChar(String s) {

        Map<Character, Integer> letterToFreq = new HashMap<>();

        //for building letter to its frequency
        for (int i = 0; i < s.length(); i++) {
            letterToFreq.put(s.charAt(i), letterToFreq.getOrDefault(s.charAt(i), 0) + 1);
        }

        //iterating one by one and when  we get first count == 1 then return that position

        for (int i = 0; i < s.length(); i++) {
            if (letterToFreq.get(s.charAt(i)) == 1)
                return i;
        }

        return -1;
    }


}
