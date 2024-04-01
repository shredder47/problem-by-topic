package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordTest {

    /**
     * This class tests the 'lengthOfLastWord' method in the 'LengthOfLastWord' class.
     * The lengthOfLastWord method calculates the length of the last word in a given string, with the last word being the 
     * last sequence of non-space characters in the string. 
     * If the last word does not exist, it returns 0. 
     */

    @Test
    public void testLengthOfLastWord(){

        LengthOfLastWord lengthOfLastWordTest = new LengthOfLastWord();

        String testInput1 = "Hello World";
        int expectedOutput1 = 5;
        assertEquals(expectedOutput1, lengthOfLastWordTest.lengthOfLastWord(testInput1));

        String testInput2 = "   fly me   to   the moon  ";
        int expectedOutput2 = 4;
        assertEquals(expectedOutput2, lengthOfLastWordTest.lengthOfLastWord(testInput2));

        String testInput3 = "luffy is still joyboy";
        int expectedOutput3 = 6;
        assertEquals(expectedOutput3, lengthOfLastWordTest.lengthOfLastWord(testInput3));
    }
}