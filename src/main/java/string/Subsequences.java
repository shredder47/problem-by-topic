package string;

//https://www.codingninjas.com/studio/problems/subsequences-of-string_985087

import java.util.ArrayList;
import java.util.List;

public class Subsequences {

//    Sample Input 1:
//            1
//    abc
//    Sample Output 1:
//    a ab abc ac b bc c
//    Explanation of sample input 1:
//    All possible subsequences of abc are :
//            “a” , “b” , “c” , “ab” , “bc” , “ac”, “abc”
//    Sample Input 2:
//            1
//    bbb
//    Sample Output 2:
//    b b b bb bb bb bbb

    public static ArrayList<String> subsequences(String str) {
        // Write your code here

        if(str.isEmpty() || str.length() == 1) {
            ArrayList<String> strings = new ArrayList<>();
            strings.add(str);
            return strings;
        }
        //https://youtu.be/Y85dfkCSlP8?si=CbRazpn2dkMUHE0-&t=342
       /*
             ""                             = ""
         a   "" , | "" + 'a'                = "" , "a"
         b   "" , "a" | ""+'b' , "a"+'b'    = "" , "b" , "b" , "ab"
        */

        ArrayList<String> strings = new ArrayList<>();
        strings.add("");

        char[] charArray = str.toCharArray();

        List<String> temp = new ArrayList<>();

        for (char c : charArray) {

            for (String string : strings) {
                temp.add(string + c);
            }

            strings.addAll(temp);
            temp = new ArrayList<>();
        }

        strings.remove(0);
        return strings;

    }

}
