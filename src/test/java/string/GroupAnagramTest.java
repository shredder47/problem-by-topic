package string;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class GroupAnagramTest {

    /**
     * This class is used to test the method 'groupAnagrams' of the class 'GroupAnagram'.
     * The method groups the anagrams together and returns a list of lists containing the anagrams.
     */

    @Test
    public void testGroupAnagrams() {

        // Test 1: testing normal case
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> actual = GroupAnagram.groupAnagrams(strs1);
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(Collections.singletonList("bat"));
        expected.add(Arrays.asList("tan", "nat"));
        expected.add(Arrays.asList("eat", "tea", "ate"));
        assertEquals(new HashSet<>(expected), new HashSet<>(actual));

        // Test 2: testing corner case with empty string
        String[] strs2 = {""};
        actual = GroupAnagram.groupAnagrams(strs2);
        expected = new ArrayList<List<String>>();
        expected.add(Collections.singletonList(""));
        assertEquals(new HashSet<>(expected), new HashSet<>(actual));

        // Test 3: testing corner case with single character
        String[] strs3 = {"a"};
        actual = GroupAnagram.groupAnagrams(strs3);
        expected = new ArrayList<List<String>>();
        expected.add(Collections.singletonList("a"));
        assertEquals(new HashSet<>(expected), new HashSet<>(actual));
    }
}