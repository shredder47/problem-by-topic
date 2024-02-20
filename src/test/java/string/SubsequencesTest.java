package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubsequencesTest {


    Subsequences s = new Subsequences();
    @Test
    public void subsequences() {

        System.out.println(Subsequences.subsequences("bbb"));
        System.out.println(Subsequences.subsequences("abc"));
    }
}