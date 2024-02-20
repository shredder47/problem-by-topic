package recursivecodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombinationsOfPhoneNumber {


//    Example 1:
//
//    Input: digits = "23"
//    Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
//    Example 2:
//
//    Input: digits = ""
//    Output: []
//    Example 3:
//
//    Input: digits = "2"
//    Output: ["a","b","c"]

    public List<String> letterCombinations(String digits) {

        List<String> combinations = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<>();
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");

        backtrack(combinations, phoneMap, digits, 0, new StringBuilder());
        return combinations;
    }

    private void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuilder current) {

        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }

        String possibleLetters = phoneMap.get(digits.charAt(index));

        for (char letter : possibleLetters.toCharArray()) {

            current.append(letter);
            backtrack(combinations, phoneMap, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);

        }
    }











    /*public List<String> letterCombinations(String digits) {

        if(digits.isEmpty())
            return Collections.emptyList();;

        List<String> answer = new ArrayList<>();

        String combinations = "";

        int index = 0;

        String[] values = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        solve(digits, index, combinations, answer, values);

        return answer;
    }

    //abc , def

    private void solve(String numbers, int index, String combinations, List<String> answer, String[] values) {

        if (index >= numbers.length()) {
            answer.add(combinations);
            return;
        }

        int number = Integer.parseInt(Character.toString(numbers.charAt(index)));

        char[] charArray = values[number].toCharArray();

        for (char ch : charArray) {

            combinations = combinations + (ch);

            solve(numbers, index + 1, combinations, answer, values);
            //backtrack
            combinations = combinations.substring(0, combinations.length() - 1);

        }
    }*/
}
