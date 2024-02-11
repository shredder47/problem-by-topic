package string;


import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/valid-anagram/description/
public class Anagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        Map<Character, Integer> sf = new HashMap<>();
        Map<Character, Integer> tf = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            sf.put(s.charAt(i), sf.getOrDefault(s.charAt(i), 0) + 1);
            tf.put(t.charAt(i), tf.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer countS = sf.get(c);
            if (tf.containsKey(c)) {
                Integer countT = tf.get(c);
                if (countT.equals(countS)) continue;
                else return false;

            } else return false;
        }

        return true;
    }


}
