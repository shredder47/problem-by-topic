package string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsInStringTest {

    ReverseWordsInString f = new ReverseWordsInString();
    @Test
    public void reverseWords1() {

        String s = "the sky is blue";
        Assert.assertEquals("blue is sky the",f.reverseWords(s));
    }

    @Test
    public void reverseWords2() {

        String s = "  hello world  ";
        Assert.assertEquals("world hello",f.reverseWords(s));
    }

    @Test
    public void reverseWords3() {

        String s = "a good   example";
        Assert.assertEquals("example good a",f.reverseWords(s));
    }
}