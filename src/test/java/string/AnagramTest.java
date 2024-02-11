package string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram a = new Anagram();
    @Test
    public void isAnagram() {

        Assert.assertTrue(a.isAnagram("appa", "apap"));
        Assert.assertFalse(a.isAnagram("appa", "apapa"));
        Assert.assertFalse(a.isAnagram("a", "apapa"));

    }
}