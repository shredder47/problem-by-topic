package string;


import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {

//    Example 1:
//
//    Input: s = 'III'
//    Output: 3
//    Explanation: III = 3.
//    Example 2:
//
//    Input: s = 'LVIII'
//    Output: 58
//    Explanation: L = 50, V= 5, III = 3.
//    Example 3:
//
//    Input: s = 'MCMXCIV'
//    Output: 1994
//    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.

    public int romanToInt(String s) {

        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        if (s.length() == 1) return romanToInt.get(s.charAt(0));

        int result = romanToInt.get(s.charAt(0));
        int lastValue = romanToInt.get(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {


            int currentValue = romanToInt.get(s.charAt(i));
            // ROMAN Number are usually High to Low |
            // If LOW TO HIGH then we subtract
            // Example:
            // [M]CM When M comes we add to Result = 1000
            // M[C]M When C comes we add to Result = 1100 M > C hence Add
            // MC[M] When M comes after C i.e. lower -> bigger we first subtract the lower from result and then subtract the lower from Bigger and then add the finalValue to result
            // 1100 - 100(because of C) + { 1000 - 100}  = 1900
            if (lastValue >= currentValue) {
                result += currentValue;
                lastValue = currentValue;
            } else {
                int temp = currentValue - lastValue;
                result -= lastValue;
                lastValue = currentValue;
                result += temp;
            }
        }
        return result;
    }

}
