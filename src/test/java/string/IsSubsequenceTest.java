package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsSubsequenceTest {

    IsSubsequence i = new IsSubsequence();
    @Test
    public void isSubsequence() {

        String s= "abc";
        String t= "ahbgdc";

        System.out.println(i.isSubsequence(s,t));

    }

    @Test
    public void isSubsequence2() {

        String s= "axc";
        String t= "ahbgdc";

        System.out.println(i.isSubsequence(s,t));

    }
}
